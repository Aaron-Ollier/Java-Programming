import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Character {

    // Attributes
    protected String name;
    protected int health;
    protected int maxDamage;
    protected int armour;
    protected int startingHealth;
    protected boolean stunned;


    // Construct
    public Character (String name, int health, int maxDamage, int armour) {
        this.name = name;
        this.health = health;
        this.maxDamage = maxDamage;
        this.armour = armour;
        stunned = false;
    }




    // Set Methods
    public boolean isStunned(){
        return stunned;
    }
    public void Stun(){
        System.out.println("Is Stunned");
        stunned = true;
    }
    public int getStartingHealth() {
        return startingHealth;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setmaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
    public void setarmour(int armour) {
        this.armour = armour;
    }




    // Get Methods
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getmaxDamage() {
        return maxDamage;
    }
    public int getarmour() {
        return armour;
    }




    // Methods
    public void Attack(Character enemy) {
        if(isStunned()){
            System.out.println(name + " cannot attack");
            stunned = false;
            return;
        }
        Random rnd = new Random();
        int damage = rnd.nextInt(maxDamage) +1;

        System.out.println(name + " attacked "+ enemy.name + " for " + damage + " damage");

        enemy.ReceivedAttack(damage);
    }

    public void ReceivedAttack(int damage) {
        Random rnd = new Random();
        int chance = rnd.nextInt(100) + 1;
        if (chance < armour) {
            System.out.println("*WHOW* Armour helped avoid all the damage");
        } else {
            if (damage >= health) {
                health = 0;
            } else {
                health -= damage;
            }
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void victorySpeech() {
        System.out.println("\n=================================================================\n");
        System.out.println(name + " Said: MUHAHAHAHAH!");
    }

    public void DieSpeech() {
        System.out.println("\n=================================================================\n");
        System.out.println(name + " Said: I WILL DEFEAT YOU!");
        System.out.println("\n=================================================================\n");
    }

    public void displayHealth() {
        System.out.println(name + " has " + health + " health.");
        System.out.println("\n*** Round Over ***");
        System.out.println("\n=================================================================\n");


    }

    public void entranceSpeech() {
        System.out.println(name + " Said: Try me!");
        System.out.println("\n=================================================================\n");
    }

    public void displayInfo() {
        System.out.println(name + " is the character name!");
        System.out.println(name + " has " + health + " health.");
        System.out.println(name + " has a max damage of " + maxDamage + ".");
        System.out.println(name + " has " + armour + " armour.");
        System.out.println("\n=================================================================\n");

    }

    public void showPic(String filename)
    {
        try
        {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();

        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
