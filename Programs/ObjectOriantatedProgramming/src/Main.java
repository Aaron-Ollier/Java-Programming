import java.util.Scanner;

public class Main {
    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Box
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double length = sc.nextDouble();
        System.out.print("Enter second number: ");
        double height = sc.nextDouble();
        System.out.print("Enter third number: ");
        double width = sc.nextDouble();

        Box cube = new Box(length, height, width);

        System.out.println("Length: " + cube.getLength() + " | " + " Height: " +
                cube.getHeight() + " | " + " Width: " + cube.getWidth());
        System.out.println("The volume Of the Box is: " + cube.showVolume());

        cube.checkIfCube();


    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        // Cars

        Car hatchback = new Car("Subaru", "WRX STI", 3);

        hatchback.setMake("Subaru");
        hatchback.setModel("WRX STI");
        hatchback.setNumberOfDoors(3);

        System.out.println("Uses the 'Get Methods': " + "Make: " + hatchback.getMake() + " | " + " Modal: " +
                hatchback.getModel() + " | " + " Door's: " + hatchback.getDoors());

        hatchback.DescribeCar();


    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=


    }


}