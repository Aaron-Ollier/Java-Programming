import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

        // CODING ACTIVITIES - Decisions

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 1

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();

        if (age <= 12) {
            System.out.println("You are a child.");
        } else if (age > 12 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        // Program 2

        Scanner scan2 = new Scanner(System.in);

        double score1, score2, score3, score4;
        double average;

        System.out.print("Enter the first score: ");
        score1 = scan2.nextDouble();

        System.out.print("Enter the second score: ");
        score2 = scan2.nextDouble();

        System.out.print("Enter the third score: ");
        score3 = scan2.nextDouble();

        System.out.print("Enter the fourth score: ");
        score4 = scan2.nextDouble();

        average = (score1 + score2 + score3 + score4) / 4;
        average = average / 40 * 100;

        System.out.println("The average percentage is: " + average + "%");

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 3

        Scanner scan3 = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter the first number: ");
        num1 = scan3.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scan3.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scan3.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The first number is the largest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The second number is the largest.");
        } else {
            System.out.println("The third number is the largest.");
        }

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 4

        Scanner scan4 = new Scanner(System.in);

        String password;

        System.out.print("Enter your password: ");
        password = scan4.nextLine();

        if (password.length() >= 6 && password.length() <= 12) {
            if (password.equals("B4nana")) {
                System.out.println("Password correct.");
            } else {
                System.out.println("Password incorrect.");
            }
        } else {
            System.out.println("Password must be between 6 and 12 characters.");
        }

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 5

        Scanner scan5 = new Scanner(System.in);

        double number;

        System.out.print("Enter a floating-point number: ");
        number = scan5.nextDouble();

        if (number == 0) {
            System.out.println("zero");
        } else {
            if (number > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

            if (Math.abs(number) < 1) {
                System.out.println(" small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 6

        Scanner scan6 = new Scanner(System.in);

        int number1;

        System.out.print("Enter a number from 1 to 7: ");
        number1 = scan6.nextInt();

        switch (number1) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input.");
        }

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

        // CODING ACTIVITIES - Repetitions

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

        //Program 1
        Scanner scan7 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan7.nextInt();

        System.out.println("The " + num + " times table is:");
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 2
        int i = 1, sum = 0;

        // Using while loop
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("The sum of the first 10 natural numbers using while loop: " + sum);

        // Reset sum and i
        sum = 0;
        i = 1;

        // Using do-while loop
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("The sum of the first 10 natural numbers using do-while loop: " + sum);

        // Reset sum and i
        sum = 0;
        i = 1;

        // Using for loop
        for (i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of the first 10 natural numbers using for loop: " + sum);

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 3
        Scanner scan8 = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int num4 = scan8.nextInt();

        int evenSum = 0, oddSum = 0;
        for (int n = 1; n <= num4; n++) {
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }
        System.out.println("The sum of even number up to " + num4 + " is: " + evenSum);
        System.out.println("The sum of odd number up to " + num4 + " is: " + oddSum);

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //Program 4
        Scanner scan9 = new Scanner(System.in);
        String name;
        double hourlyRate, hoursWorked, grossPay, netPay, taxRate = 0.20;

        System.out.print("Enter employee name (or End to exit): ");
        name = scan9.nextLine();

        while (!name.equals("End")) {
            System.out.print("Enter hourly rate: ");
            hourlyRate = scan9.nextDouble();

            System.out.print("Enter hours worked: ");
            hoursWorked = scan9.nextDouble();

            grossPay = hourlyRate * hoursWorked;
            netPay = grossPay * (1 - taxRate);

            System.out.println("Employee name: " + name);
            System.out.println("Hourly rate: £" + hourlyRate);
            System.out.println("Hours worked: " + hoursWorked);
            System.out.println("Gross pay: £" + grossPay);
            System.out.println("Net pay: £" + netPay);

            System.out.print("\nEnter employee name (or End to exit): ");
            scan.nextLine();
            name = scan.nextLine();
        }

        System.out.println("Exiting program...");

    }
}
