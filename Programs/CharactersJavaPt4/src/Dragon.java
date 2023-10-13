import java.util.Random;

public class Dragon extends Character {

        // Construct
        public Dragon (String name) {
            super("Dragon", 50, 60, 10);
        }

        // Methods
        public void victorySpeech() {
            System.out.println("\n=================================================================\n");
            System.out.println(name + " Said: TO WEAK!");
        }
        public void DieSpeech() {
            System.out.println("\n=================================================================\n");
            System.out.println("\n" + name + " Said: NOOOOOO!");
            System.out.println("\n=================================================================\n");
        }
        public void entranceSpeech() {
            showPic("Dragon.txt");
            System.out.println("\n" + name + " Said: You Will Not Win Against Me!");
            System.out.println("\n=================================================================\n");
        }
    public void Attack(Character enemy) {
        Random rnd = new Random();
        int attackType = rnd.nextInt(3) + 1;
        int damage = 0;

        switch (attackType) {
            case 1:
                damage = rnd.nextInt(maxDamage/2) + 1; // Attack type 1 does half the maximum damage
                System.out.println(name + " used attack *Tail Strike* and dealt " + damage + " damage to " + enemy.name);
                Stun();
                break;
            case 2:
                damage = rnd.nextInt(maxDamage) + 1; // Attack type 2 does full maximum damage
                System.out.println(name + " used attack *Bite* and dealt " + damage + " damage to " + enemy.name);
                Stun();
                break;
            case 3:
                damage = rnd.nextInt(maxDamage * 2) + 1; // Attack type 3 does double the maximum damage
                System.out.println(name + " used attack *Fire Breath* and dealt " + damage + " damage to " + enemy.name);
                Stun();
                break;
            default:
                break;
        }

        enemy.ReceivedAttack(damage);
    }

}