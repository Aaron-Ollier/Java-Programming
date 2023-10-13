import java.util.Scanner;
public class Arena extends Character {

    // Construct
    public Arena (String name) {
        super("Aaron", 100, 50, 50);
    }

    public void LoadArena() {

        Hero Player1 = new Hero("Aaron", 100, 50, 50, 3, 100);

        Vex NewVex = new Vex("Vex");
        Orc NewOrc = new Orc("Orc");
        Dragon NewDragon = new Dragon("Dragon");

        Character[] Monsters = new Character[3];
        Monsters[0] = NewDragon;
        Monsters[1] = NewOrc;
        Monsters[2] = NewVex;

        System.out.println("\n");

        System.out.println("\n====================== Character ======================");

        Scanner name = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("What is your character name? : ");
        String getName = name.next();
        Player1.setName(getName);
        System.out.print("\n");
        Player1.entranceSpeech();


        boolean playerAlive = true;
        int healthPotionsUsed = 0;
        for (int i = 0; i < Monsters.length; i++) {
            if (!playerAlive) {
                break;
            }

            Character monster = Monsters[i];

            if (i == Monsters.length - 1) {
                System.out.println("\n================== Final Round: " + monster.getName() + " ==================");
            } else {
                System.out.println("\n================== New Monster Entered: " + monster.getName() + " ==================");
            }

            monster.entranceSpeech();
            wait(2000);

            do {
                if (monster.isAlive()) {
                    System.out.println("*** Round Start *** \n");
                    monster.Attack(Player1);
                    System.out.println("");
                    Player1.displayHealth();
                }
                wait(3000);

                if (Player1.isAlive()) {
                    System.out.println("*** Round Start *** \n");
                    Player1.Attack(monster);
                    System.out.println("");
                    monster.displayHealth();
                }
                wait(3000);

                if (Player1.isAlive()) {
                    int startingHealth = ((Hero) Player1).getStartingHealth();
                    if (Player1.getHealth() < startingHealth / 2) {
                        System.out.println("Do you want to use a health potion? (yes or no)");
                        Scanner scanner = new Scanner(System.in);
                        String input = scanner.next();

                        if (input.equalsIgnoreCase("yes")) {
                            if (Player1.healthPotion() > 0) {
                                Player1.useHealthPotion();
                                healthPotionsUsed++;
                            } else {
                                System.out.println("You don't have any health potions left.");
                            }
                        }
                    } else {
                        System.out.println("You don't need a health potion now. Keep Fighting.");
                        System.out.println("\n=================================================================\n");
                    }
                }

                wait(5000);

            } while (monster.isAlive() && Player1.isAlive());

            if (Player1.isAlive()) {
                System.out.println("Player Wins!");
                Player1.victorySpeech();
                monster.DieSpeech();
            } else {
                System.out.println("Monster Wins!");
                monster.victorySpeech();
                Player1.DieSpeech();
                playerAlive = false;
            }

            if (Player1.getHealth() <= 0) {
                playerAlive = false;
                break;
            }

        }

        if (playerAlive) {
            System.out.println("Game Over! WhooHoo! You have defeated all the monsters!");
        } else {
            System.out.println("Game Over! Player has no health left.");
        }

        System.out.println("\n=================================================================\n");
        System.out.println("Health Potions Used: " + healthPotionsUsed);
        System.out.println("\n=================================================================\n");

    }

    public static void wait(int mseconds) {
        long now = System.currentTimeMillis();
        long end = now + (mseconds);
        while (System.currentTimeMillis() <= end) {
        }
    }

}
