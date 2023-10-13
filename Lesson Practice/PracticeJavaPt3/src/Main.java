import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("=======================================");
        System.out.println("          Division Calculator          ");
        System.out.println("=======================================");

        Scanner Cal1 = new Scanner(System.in);
        System.out.print("Enter Numerator : ");
        int num1 = Cal1.nextInt();

        Scanner Cal2 = new Scanner(System.in);
        System.out.print("Enter Divisor : ");
        int num2 = Cal2.nextInt();

        try {
            int answer = num1 / num2;
            System.out.println("Answer = " + answer);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }

        System.out.println("");
        System.out.println("=======================================");
        System.out.println("    Convert The Input To An Integer    ");
        System.out.println("=======================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("The number entered is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: You did not enter a valid number");
        }
    }
}
