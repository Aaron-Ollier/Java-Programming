import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Main {


    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // *** Main ***
    public static void main(String[] args) {

        /*
        //String Manipulation
        String wordsOne = String.valueOf("Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 years old".charAt(15));
        int wordsTwo = "Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 years old".length();
        String wordsThree = "Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 years old".substring(2, 8);
        String wordsFour = String.valueOf("Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 years old".contains("e"));
        String wordsFive = String.valueOf("Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 years old".isEmpty());
        String wordsSix = "Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 year old".replace("year", "years");
        String wordsSevern = String.valueOf("Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 year old".equalsIgnoreCase("cleric"));
        String wordsEight = String.valueOf("Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 year old".indexOf("8"));
        String wordsNine = "Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 year old".toLowerCase();
        String wordTen = "Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 year old".toUpperCase();
        String wordsEleven = "             Hi, my name is Aaron, Im a programmer at Cleric Computer Services and I am 18 year old                        ".trim();
        System.out.println(wordsOne);
        System.out.println(wordsTwo);
        System.out.println(wordsThree);
        System.out.println(wordsFour);
        System.out.println(wordsFive);
        System.out.println(wordsSix);
        System.out.println(wordsSevern);
        System.out.println(wordsEight);
        System.out.println(wordsNine);
        System.out.println(wordTen);
        System.out.println(wordsEleven);

         */ //String Manipulation


        /*

        //Method Numbers
        System.out.println("\n *** Smallest Number Out Of Three ***");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();
        int smallest = findSmallestNumber(first, second, third);
        System.out.println("Smallest number: " + smallest);

        //Compute Average
        System.out.println("\n *** Compute Average Out Of Three ***");
        Scanner timesTableIn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstTable = timesTableIn.nextInt();
        System.out.print("Enter second number: ");
        int secondTable = timesTableIn.nextInt();
        System.out.print("Enter third number: ");
        int thirdTable = timesTableIn.nextInt();
        double average = computeAverage(first, second, third);
        System.out.println("Average: " + average);

        // Times Table
        System.out.println("\n *** Three Times Table ***");
        displayTimesTable(3, 12);

        // Area Of A Triangle
        Scanner triangleIn = new Scanner(System.in);
        System.out.println("\n *** Area Of Triangle ***");
        System.out.print("Enter the base of the triangle: ");
        double base = triangleIn.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = triangleIn.nextDouble();
        double areaTriangle = calculateTriangleArea(base, height);
        System.out.println("The area of the triangle is: " + areaTriangle);

        // Area Of A Rectangle
        System.out.println("\n *** Area Of Rectangle ***");
        Scanner rectangleIn = new Scanner(System.in);
        System.out.print("Enter the base of the Rectangle: ");
        double length = rectangleIn.nextDouble();
        System.out.print("Enter the height of the Rectangle: ");
        double width = rectangleIn.nextDouble();
        double areaRectangle = calculateRectangleArea(length, width);
        System.out.println("The area of the Rectangle is: " + areaRectangle);

        // Area Of A Circle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle is: " + area);

        //Odd Or Even
        System.out.println("\n *** Odd Or Even ***");
        Scanner OddOrEvenIn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num = OddOrEvenIn.nextInt();
        if (isEven(num)) {
            System.out.println("This number: " + num + ", is even");
        } else {
            System.out.println("This number: " + num + ", is odd");
        }

        // VATCalc
        System.out.println("\n *** VATCalc ***");
        Scanner totalIn = new Scanner(System.in);
        System.out.print("Enter total price: £");
        double totalPrice = totalIn.nextDouble();
        String vatAmount = VATCalc(totalPrice);
        System.out.println(vatAmount);

        // Format Film Length
        System.out.println("\n *** Format Film Length ***");
        Scanner lengthIn = new Scanner(System.in);
        System.out.print("Enter film length in minutes: ");
        int lengthInMinutes = lengthIn.nextInt();
        String formattedLength = formatFilmLength(lengthInMinutes);
        System.out.println("Formatted film length: " + formattedLength);

        //poundsToKilograms & kilogramsToPounds
        System.out.println("\n *** Pounds To Kilograms & kilograms To Pounds ***");
        Scanner valIn = new Scanner(System.in);
        System.out.print("Enter pounds or kilograms (p/k): ");
        String unit = valIn.next();
        System.out.print("Enter the value: ");
        double value = valIn.nextDouble();
        if (unit.equalsIgnoreCase("p")) {
            double kilograms = poundsToKilograms(value);
            System.out.println(value + " pounds = " + kilograms + " kilograms");
        } else if (unit.equalsIgnoreCase("k")) {
            double pounds = kilogramsToPounds(value);
            System.out.println(value + " kilograms = " + pounds + " pounds");
        } else {
            System.out.println("Invalid unit.");
        }

        //Read and Write From a file
        InputOutputFromFile();



        // Percentage Guessing Game
        percentageGuessingGame();

         */ // Practice Programs


    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // *** Percentage Guessing Game ***
    public static void  percentageGuessingGame() {
        Scanner scanner = new Scanner(System.in);

        // Play the game for 3 turns
        for (int turn = 1; turn <= 3; turn++) {
            // Generate a random percentage between 1 and 100
            int percentage = (int) (Math.random() * 100) + 1;

            // Print instructions and representation of the percentage
            System.out.println(Ccol.WHITE_BOLD_BRIGHT + "Guess the percentage: ");
            System.out.print(Ccol.GREEN_BOLD + "[");
            for (int i = 0; i < percentage; i++) {
                System.out.print(Ccol.GREEN_BOLD + "-");
            }
            for (int i = (percentage); i < 100; i++) {
                System.out.print(" ");
            }
            System.out.println(Ccol.GREEN_BOLD + "]");

            // Get the user's guess
            int guess = scanner.nextInt();

            // Keep asking for a new guess until the user gets it right
            while (percentage != guess) {

                int wasOutBy = guess - percentage;
                wasOutBy = Math.abs(wasOutBy);

                System.out.println(guess < percentage ? Ccol.BLUE_BOLD + "Too low! Guess again: " : Ccol.RED_BOLD +
                        "Too high! Guess again: ");
                System.out.println("You were out by: " + wasOutBy);
                guess = scanner.nextInt();


                // Validate the user's guess
                while (guess > 100 || guess < 0) {
                    System.out.println(Ccol.RED_BOLD + guess + " Is an invalid number. Please enter a number " +
                            "between 0 and 100.");
                    guess = scanner.nextInt();
                }
            }

            // Print the correct answer
            System.out.print(Ccol.GREEN_BOLD + "[");
            for (int i = 0; i < (percentage); i++) {
                System.out.print(Ccol.GREEN_BOLD + "-");
            }
            for (int i = (percentage); i < 100; i++) {
                System.out.print(" ");
            }
            System.out.println(Ccol.GREEN_BOLD + "]");
            System.out.println(Ccol.GREEN_BOLD_BRIGHT + "Correct! The percentage was " + percentage + "%" + "\n");
        }
    }


    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // *** Read and Write From a file ***
    public static void InputOutputFromFile() {
        //Input from a file
        int num1, num3;
        double num2;
        String name;

        try {
            Scanner in = new Scanner(new File("in.txt"));
            num1 = in.nextInt();
            num2 = in.nextDouble();
            name = in.next();
            num3 = in.nextInt();
            System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1+num2);
            System.out.printf("Hi the last number is %d %n", num3);
            in.close();
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("File not found");
        }


        //Write to a file
        try{
            PrintWriter writer = new PrintWriter("test.txt", StandardCharsets.UTF_8);
            writer.println("This is a test on line 1");
            writer.println("This is a test on line 2");
            writer.close();
        }catch (IOException e) {
            System.out.println("Error");
        }


    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // *** Methods Exercises ***
    public static int findSmallestNumber(int first, int second, int third) {
        if (first < second && first < third) {
            return first;
        }
        if (second < first && second < third) {
            return second;
        } else {
            return third;
        }
    }

    public static double computeAverage(int first, int second, int third) {
        return (first + second + third) / 3.0;
    }

    public static void displayTimesTable(int table, int max) {
        for (int i = 1; i <= max; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159265358979323846;
        double area = PI * radius * radius;
        return area;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static String VATCalc(double totalPrice) {
        double vatRate = 0.20;
        double vatAmount = totalPrice * vatRate;
        return "VAT amount: £" + vatAmount;
    }

    public static String formatFilmLength(int lengthInMinutes) {
        int hours = lengthInMinutes / 60;
        int minutes = lengthInMinutes % 60;
        return hours + "h " + minutes + " minutes";

    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.45359237;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms / 0.45359237;
    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // *** Pre Exercises ***
    public static void scannerAndPrintLine() {
        System.out.println("\n *** scannerAndPrintLine ***");

        //Scanner
        Scanner input = new Scanner(System.in);

        //Name Input
        System.out.println("What is your 'First' name?");
        String name = input.next();

        //Age Input
        System.out.println("How old are you?");
        int age = input.nextInt();

        //Print Name and Age
        System.out.println("Hi there " + name + "!" + " and you are " + age + " years old. ");
    }

    public static void printF() {
        System.out.println("\n *** printF ***");

        System.out.printf("Hello%2d and %6s%n", 8, "HI!");
        System.out.printf("Second%n");
        System.out.printf("Hi,%s%4d%n", "Hello", 88);
        System.out.printf("Hi, %d %4.2f%n", 8, 5.556);
        System.out.printf("Hi,%-4s&%6.2f%n", "Hi", 5.5);
        System.out.printf("Hi, Hi, %.4f%n", 5.56);
    }

    public static void TotalAndMaxUsingLoops() {
        System.out.println("\n *** TotalAndMaxUsingLoops ***");

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = inp.nextInt();
        double[] array = new double[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = inp.nextDouble();
        }

        String add = "yes";
        while (add.equals("yes")) {
            System.out.println("Do you want to add one more element? (yes/no)");
            add = inp.next();
            if (add.equals("yes")) {
                n++;
                double[] newArray = new double[n];
                System.arraycopy(array, 0, newArray, 0, array.length);
                System.out.println("Enter the new element:");
                newArray[n - 1] = inp.nextDouble();
                array = newArray;
            }
        }

        // Display the elements
        System.out.println("The elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "");
        }

        // Total of the array
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += array[i];
        }
        System.out.println("The Total is: " + total);

        // Max number in the array
        double max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The Biggest is: " + max);
    }

    public static void ForLoop() {
        System.out.println("\n *** ForLoop ***");

        double[] array = {1.1, 1.2, 1.3, 1.4, 1.5};

        System.out.println("For Each Loop");
        // For Each Loop
        for (double number : array) {
            System.out.println(number);
        }
        System.out.println("Normal For Loop");

        // For Loop
        for (double v : array) {
            System.out.println(v);
        }
    }

}
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=