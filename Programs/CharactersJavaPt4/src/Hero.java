
public class Hero extends Character{

        // Attributes
        protected int healthPotion;

    public Hero (String name, int health, int maxDamage, int armour, int healthPotion, int startingHealth) {
        super(name, health, maxDamage, armour);
        this.healthPotion = healthPotion;
        this.startingHealth = startingHealth;
    }

    public void setHealthPotion(int healthPotion) {
        this.healthPotion = healthPotion;
    }

    public int healthPotion() {
        return healthPotion;
    }

    public void useHealthPotion() {
        if (healthPotion > 0) {
            int startingHealth = 100; // assuming the starting health is 100
            int restoredHealth = startingHealth - health; // calculate the amount of health to restore
            health += restoredHealth; // add the restored health to the current health of the Hero object
            this.healthPotion--; // reduce the number of health potions
            System.out.println(this.getName() + " used a health potion and restored " + restoredHealth + " health.");
        } else {
            System.out.println("You don't have any health potions left.");
        }
    }


}
