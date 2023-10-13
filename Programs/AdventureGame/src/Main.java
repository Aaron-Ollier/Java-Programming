import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int health = 100;
        int gold = 0;

        System.out.println("Welcome to the adventure game!");
        System.out.print("What is your name? ");
        name = input.nextLine();

        while (health > 0) {
            System.out.println("You are currently in a forest.");
            System.out.println("Your health is " + health + " and you have " + gold + " gold.");
            System.out.println("What would you like to do?");
            System.out.println("1. Go on a quest");
            System.out.println("2. Rest at a inn");
            System.out.println("3. Visit a shop");
            System.out.println("4. Quit the game");

            int choice = input.nextInt();
            if (choice == 1) {
                int damage = (int)(Math.random() * 25);
                health -= damage;
                gold += 10;
                System.out.println("You went on a quest and took " + damage + " damage.");
            } else if (choice == 2) {
                health += 10;
                System.out.println("You rested at an inn and regained 10 health.");
            } else if (choice == 3) {
                gold -= 5;
                System.out.println("You visited a shop and spent 5 gold.");
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }

        System.out.println("Thank you for playing, " + name + "! You ended with " + gold + " gold.");
    }
}