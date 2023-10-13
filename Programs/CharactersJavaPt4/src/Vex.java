import java.util.Random;

public class Vex extends Character {


    // Construct
    public Vex (String name) {
        super("Vex", 30, 40, 20);

    }

    // Methods
    public void victorySpeech() {
        System.out.println("\n=================================================================\n");
        System.out.println(name  + " Said: To Easy!");
    }
    public void DieSpeech() {
        System.out.println("\n=================================================================\n");
        System.out.println("\n" + name  + " Said: Next time, this will be different!");
        System.out.println("\n=================================================================\n");
    }
    public void entranceSpeech() {
        showPic("Skeleton 1.txt");
        System.out.println("\n" + name  + " Said: You have never seen something as powerful as me!");
        System.out.println("\n=================================================================\n");
    }
    public void Attack(Character enemy) {
        Random rnd = new Random();
        int attackType = rnd.nextInt(3) + 1;
        int damage = 0;

        switch (attackType) {
            case 1:
                damage = rnd.nextInt(maxDamage/2) + 1; // Attack type 1 does half the maximum damage
                System.out.println(name + " used attack *Laser Shot* and dealt " + damage + " damage to " + enemy.name);
                break;
            case 2:
                damage = rnd.nextInt(maxDamage) + 1; // Attack type 2 does full maximum damage
                System.out.println(name + " used attack *Scratch* and dealt " + damage + " damage to " + enemy.name);
                break;
            case 3:
                damage = rnd.nextInt(maxDamage * 2) + 1; // Attack type 3 does double the maximum damage
                System.out.println(name + " used attack *Self Destruct* and dealt " + damage + " damage to " + enemy.name);
                break;
            default:
                break;
        }

        enemy.ReceivedAttack(damage);
    }


}
