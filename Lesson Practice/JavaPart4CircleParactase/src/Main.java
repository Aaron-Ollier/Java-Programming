import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle Aaron = new Circle("red", 1.0);

        System.out.println("\n");

        Scanner cradius = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        double getRadius = cradius.nextDouble();
        Aaron.setRadius(getRadius);

        System.out.println("\n");

        Scanner ccolor = new Scanner(System.in);
        System.out.print("Enter the color of the Circle: ");
        String getColor = ccolor.next();
        Aaron.setColor(getColor);

        System.out.println("\n");
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("Circle:");
        System.out.println("Color: " + Aaron.getColor());
        System.out.println("Radius: " + Aaron.getRadius());
        System.out.println("Area: " + Aaron.getArea());

        Cylinder Aaron2 = new Cylinder("red", 1.0, 1.0);
        Scanner radius = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("-------------------------------");

        System.out.print("Enter the radius of the Cylinder: ");
        double getRadius1 = radius.nextDouble();
        Aaron2.setRadius(getRadius1);

        System.out.println("\n");

        Scanner color = new Scanner(System.in);
        System.out.print("Enter the color of the Cylinder: ");
        String getColor1 = color.next();
        Aaron2.setColor(getColor1);

        System.out.println("\n");

        Scanner height = new Scanner(System.in);
        System.out.print("Enter the height of the Cylinder: ");
        double getHeight = height.nextDouble();
        Aaron2.setHeight(getHeight);

        System.out.println("\n");
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("Cylinder:");
        System.out.println("Color: " + Aaron2.getColor());
        System.out.println("Radius: " + Aaron2.getRadius());
        System.out.println("Height: " + Aaron2.getHeight());
        System.out.println("Area: " + Aaron2.getArea());
        System.out.println("Volume: " + Aaron2.getVolume());
        System.out.println("\n");
        System.out.println("-------------------------------");

    }
}