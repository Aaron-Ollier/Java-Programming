import java.util.Random;

public class Orc extends Character {

    // Construct
    public Orc (String name) {
        super("Orc", 70, 70, 30);

    }

    // Methods
    public void victorySpeech() {
        System.out.println("\n=================================================================\n");
        System.out.println(name  + " Said: Not Even A Challenge!");
    }
    public void DieSpeech() {
        System.out.println("\n=================================================================\n");
        System.out.println("\n" + name  + " Said: IMPOSABLE!");
        System.out.println("\n=================================================================\n");
    }
    public void entranceSpeech() {
        showPic("Goblin.txt");
        System.out.println("\n" + name  + " Said: You Will Not Win Against Me!");
        System.out.println("\n=================================================================\n");
    }
    public void Attack(Character enemy) {
        Random rnd = new Random();
        int attackType = rnd.nextInt(3) + 1;
        int damage = 0;

        switch (attackType) {
            case 1:
                damage = rnd.nextInt(maxDamage/2) + 1; // Attack type 1 does half the maximum damage
                System.out.println(name + " used attack *Slash* and dealt " + damage + " damage to " + enemy.name);
                break;
            case 2:
                damage = rnd.nextInt(maxDamage) + 1; // Attack type 2 does full maximum damage
                System.out.println(name + " used attack *Whip* and dealt " + damage + " damage to " + enemy.name);
                break;
            case 3:
                damage = rnd.nextInt(maxDamage * 2) + 1; // Attack type 3 does double the maximum damage
                System.out.println(name + " used attack *Laser Eye* and dealt " + damage + " damage to " + enemy.name);
                break;
            default:
                break;
        }

        enemy.ReceivedAttack(damage);
    }

}
