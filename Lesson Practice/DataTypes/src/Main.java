import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {



        /* System.out.println('\n');

        System.out.println("*** Print Screen and Data Type's Practice ***");

        //Variables

        //Small Number
        short colors = 256;
        //Single Character
        char grade = 'A';
        //Big Number
        long visitor = 2000000L;
        //Medium Number
        int lotto = 30000;
        //Decimal Number
        float pi = 3.1415926535f;
        //Big Number
        long population = 8000000L;
        //Medium Number
        int score = 88;
        //Binary Decision (Yes Or No / True Or False)
        boolean test = true;

        //Print Screen of Colors
        System.out.println("The max colors available on an 8 bit screen is " + colors);
        //Print Screen of grade
        System.out.println("You got the grade " + grade + ", Well done");
        //Print Screen of visitor
        System.out.println("The total visitor count is currently " + visitor + " visitors");
        //Print Screen of lotto
        System.out.println("You won £" + lotto);
        //Print Screen of pi
        System.out.println("pi to ten decimal places is equal to " + pi);
        //Print Screen of population
        System.out.println("The total population of the world is approximately " + population + " People");
        //Print Screen of score
        System.out.println("You got the score %" + score + ", Well done");
        //Print Screen of test
        System.out.println("Have you passed your driving test? " + test);

        */ //*** Print Screen and Data Type's Practice ***

        /*
        System.out.println('\n');
        System.out.println("*** Temp F to C ***");
        //Temp F to C

        //Array of temperatures {Temp 0, Temp 1, Temp 2, Temp 3}
        int[] temp = {30, 50, 80, 100};

        //For loop, i = index, temp.length = number in array, i++ = go to next number (index) in array
        for (int i = 0; i < temp.length; i++) {
            //calculation for converting F to C
            double celsius = (temp[i] - 32) / 1.8;
            //Print Screen of calculation of each index
            System.out.println("Temp " + i + ": " + celsius + "°C");
        }

         */ //*** Temp F to C ***

        /*
        System.out.println('\n');
        System.out.println("*** Key Scanner ***");


        Scanner NumOfColors = new Scanner(System.in);
        System.out.println("What is the max amount of colors on an 8-bit screen? Please answer with an 'Whole Number' ");
        short color;
        color = NumOfColors.nextShort();
        if (color == 256) {
            System.out.println("Correct Answer");
        }else {
            System.out.println("Incorrect Answer, Try again");
        }

        Scanner ALevelGrade = new Scanner(System.in);
        char levelGrade;
        boolean validInputGrade = false;
        while (!validInputGrade) {
            System.out.println("What is the A-level grade you got in maths? Please answer with an 'Single Character' ");
            String input = ALevelGrade.next();
            if (input.length() == 1 && input.matches("[A-G]")) {
                levelGrade = input.charAt(0);
                System.out.println("Wow you got a " + levelGrade + " Well done");
                validInputGrade = true;
            } else {
                System.out.println("Invalid input. Please enter a single character between A and G.");
            }
        }

        Scanner drivingTest = new Scanner(System.in);
        boolean validInputTest = false;
        while (!validInputTest) {
            System.out.println("Have you passed your driving test? Please answer with either, 'True' or 'False'");
            String answer = drivingTest.next();
            if (answer.equalsIgnoreCase("true")) {
                System.out.println("Good job,");
                validInputTest = true;
            } else if (answer.equalsIgnoreCase("false")) {
                System.out.println("Keep trying, you'll get there");
                validInputTest = true;
            } else {
                System.out.println("Invalid input. Please enter either 'true' or 'false'.");
            }
        }

         */ //*** Key Scanner ***

        /*
        System.out.println('\n');
        System.out.println("*** Addition Calculator ***");
        int additionNumberOne;
        int additionNumberTwo;
        int answerToSum;

        Scanner numberOneIn = new Scanner(System.in);
        System.out.println("\n Please enter your first number");

        additionNumberOne = numberOneIn.nextInt();

        Scanner numberTwoIn = new Scanner(System.in);
        System.out.println("\n Please enter your second number");

        additionNumberTwo = numberTwoIn.nextInt();

        answerToSum = additionNumberOne + additionNumberTwo;
        System.out.println("\n Here is the answer: " + answerToSum);


         */ //*** Addition Calculator ***

        /*
        System.out.println('\n');
        System.out.println("*** Average Calculator ***");
        int averageNumberOne;
        int averageNumberTwo;
        int averageNumberThree;
        int averageAdd;
        int averageTotal;

        Scanner number1In = new Scanner(System.in);
        System.out.println("\n Please enter your first number");

        averageNumberOne = number1In.nextInt();

        Scanner number2In = new Scanner(System.in);
        System.out.println("\n Please enter your second number");

        averageNumberTwo = number2In.nextInt();

        Scanner number3In = new Scanner(System.in);
        System.out.println("\n Please enter your third number");

        averageNumberThree = number3In.nextInt();

        averageAdd = averageNumberOne + averageNumberTwo + averageNumberThree;
        averageTotal = averageAdd / 3;
        System.out.println("\n Here is the answer: " + averageTotal);

         */ //*** Average Calculator ***

        /*
        System.out.println('\n');
        System.out.println("*** Swap Variable Content 'Temp Variable' ***");

        int a = 5;
        int b = 10;
        int swap = a;
        a = b;
        b = swap;
        System.out.println("a: " + a + ", b: " + b);

        System.out.println('\n');
        System.out.println("*** Swap Variable Content 'XOR' ***");
        //XOR Way:
        int c = 5;
        int d = 10;
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;

        System.out.println("c: " + c + ", d: " + d);

         */ //*** Swap Variable Content 'Temp Variable' ***

        /*
        System.out.println('\n');
        System.out.println("*** Print The Biggest Number ***");

       int numOne;
       int numTwo;

        Scanner inputNumOne = new Scanner(System.in);
        System.out.println("\n Please enter your first number");
        numOne = inputNumOne.nextInt();

        Scanner inputNumTwo = new Scanner(System.in);
        System.out.println("\n Please enter your second number");
        numTwo = inputNumTwo.nextInt();

        if(numOne > numTwo) {
            System.out.println("Your *First* Number Was Bigger: " + numOne);
        } else if (numTwo > numOne) {
            System.out.println("Your *Second* Number Was Bigger: " + numTwo);
        }else {
            System.out.println("These numbers are the same");
        }

         */ //*** Print The Biggest Number ***

        /*
        System.out.println('\n');
        System.out.println("*** Is Your Number Odd Or Even ***");

        Scanner inputMultiple = new Scanner(System.in);
        System.out.println("\n Please enter a number");
        int MultipleNumber = inputMultiple.nextInt();

        if(MultipleNumber % 2 ==0){
            System.out.println("\n This number:" + "(" + MultipleNumber + ")" + " is Even");
        }else {
            System.out.println("\n This number:" + "(" + MultipleNumber + ")" + " is Odd");
        }

         */ //*** Is Your Number Odd Or Even ***

        /*
        System.out.println('\n');
        System.out.println("*** Dice Game ***");

        int diceTotal = 0;

        Scanner diceIn = new Scanner(System.in);
        System.out.println("\n Please enter your first number (Roll One)");
        int diceNumberOne = diceIn.nextInt();


        System.out.println("\n Please enter your second number (Roll Two)");
        int diceNumberTwo = diceIn.nextInt();


        System.out.println("\n Please enter your third number (Roll Three)");
        int diceNumberThree = diceIn.nextInt();


        System.out.println("\n Please enter your fourth number (Roll Four)");
        int diceNumberFour = diceIn.nextInt();

        if(diceNumberOne % 2 ==0){
            diceTotal = diceTotal + diceNumberOne;
        }else {
            diceTotal = diceTotal - diceNumberOne;
        }
        if(diceNumberTwo % 2 ==0){
            diceTotal = diceTotal + diceNumberOne;
        }else {
            diceTotal = diceTotal - diceNumberOne;
        }
        if(diceNumberThree % 2 ==0){
            diceTotal = diceTotal + diceNumberOne;
        }else {
            diceTotal = diceTotal - diceNumberOne;
        }
        if(diceNumberFour % 2 ==0){
            diceTotal = diceTotal + diceNumberOne;
        }else {
            diceTotal = diceTotal - diceNumberOne;
        }
        if (diceTotal > 0) {
            System.out.println("\n Your score is " + diceTotal + " and you win!");
        }else {
            System.out.println("\n Your score is " + diceTotal + " sorry you lose!");
        }

        System.out.println('\n');
        System.out.println("*** Dice Game Loop ***");
        // For Loop Dice Game

        int diceTotalLoop = 0;
        Scanner diceInLoop = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("\n Please enter your number for roll " + i);
            int diceNumberIn = diceInLoop.nextInt();
            if(diceNumberIn % 2 ==0){
                diceTotalLoop = diceTotalLoop + diceNumberIn;
            }else {
                diceTotalLoop = diceTotalLoop - diceNumberIn;
            }
        }
        if (diceTotalLoop > 0) {
            System.out.println("\n Your score is " + diceTotalLoop + " and you win!");
        }else {
            System.out.println("\n Your score is " + diceTotalLoop + " sorry you lose!");
        }

         */ //*** Dice Game ***

        /*
        System.out.println('\n');
        System.out.println("*** Grade Pass/Fail (Pass = 60) ***");

        System.out.println('\n');
        System.out.println("*** Pass Grade ***");
        int pass = 60;
        Scanner gradeIn = new Scanner(System.in);
        System.out.println("\n Please enter your first Grade");
        int gradeNumOneIn = gradeIn.nextInt();

        System.out.println("\n Please enter your second Grade");
        int gradeNumTwoIn = gradeIn.nextInt();

        if(gradeNumOneIn >= pass && gradeNumTwoIn >= pass){
            System.out.println("\n You Passed");
        }else {
            System.out.println("\n You Fail");
        }

         */ //*** Grade Pass/Fail (Pass = 60) ***

        /*
        System.out.println('\n');
        System.out.println("*** Case ***");

        Scanner caseIn = new Scanner(System.in);


            System.out.println("\n Please enter a number");
            int caseNum = caseIn.nextInt();

            switch (caseNum) {
                case 1:
                    System.out.println("\n You entered Number 1!");
                    break;
                case 2:
                    System.out.println("\n You entered Number 2!");
                    break;
                case 3:
                    System.out.println("\n You entered Number 3!");
                    break;
                case 4:
                    System.out.println("\n You entered Number 4!");
                    break;
                case 5:
                    System.out.println("\n You entered Number 5!");
                    break;
                case 6:
                    System.out.println("\n You entered Number 6!");
                    break;
                case 7:
                    System.out.println("\n You entered Number 7!");
                    break;
                case 8:
                    System.out.println("\n You entered Number 8!");
                    break;
                case 9:
                    System.out.println("\n You entered Number 9!");
                    break;
                default:
                    System.out.println("\n Invalid input!");
                    break;
            }

         */ //*** Case ***

        /*
        System.out.println('\n');
        System.out.println("*** Addition Calculator ***");
        int additionNumberOneCal;
        int additionNumberTwoCal;
        int answerToSumCal;

        Scanner cal = new Scanner(System.in);
        System.out.println("\n Please enter your first number");
        additionNumberOneCal = cal.nextInt();

        System.out.println("\n Please enter your second number");
        additionNumberTwoCal = cal.nextInt();

        answerToSumCal = additionNumberOneCal + additionNumberTwoCal;
        System.out.println("\n Here is the answer: " + answerToSumCal);





        System.out.println('\n');
        System.out.println("*** Is Your Number Odd Or Even ***");

        Scanner inputMultipleOE = new Scanner(System.in);
        System.out.println("\n Please enter your first number");
        int MultipleNum = inputMultipleOE.nextInt();

        if(MultipleNum % 2 ==0){
            System.out.println("\n This number is even");
        }else {
            System.out.println("\n This number is Odd");
        }




        System.out.println('\n');
        System.out.println("*** Multiply Decimal Numbers ***");

        Scanner MultiplyIn = new Scanner(System.in);

        System.out.println("\n Please enter your first number");
        double  multiplyNumberOne = MultiplyIn.nextDouble();

        System.out.println("\n Please enter your second number");
        double  multiplyNumberTwo = MultiplyIn.nextDouble();

        System.out.println("\n Here is the answer");
        double  multiplyTotal = multiplyNumberOne * multiplyNumberTwo;
        System.out.println(multiplyTotal);

         */ //Work Sheet Activities

        /*
        System.out.println('\n');
        System.out.println("*** Check Leap Year ***");

        Scanner yearIn = new Scanner(System.in);

        System.out.println("\n Please enter a year");
        int year = yearIn.nextInt();

        if (year % 4 == 0) {
            System.out.println("\n The year is a leap year (it has 366 days).");
            if (year % 100 == 0) {
                System.out.println("\n The year is a leap year (it has 366 days).");
                if (year % 400 == 0){
                    System.out.println("\n The year is a leap year (it has 366 days).");
                }
            }
        } else {
            System.out.println("\n The year is not a leap year (it has 365 days).");
        }


         */ //*** Check Leap Year ***

        /*
        System.out.println('\n');
        System.out.println("*** Check if Vowel or Consonant ***");

        Scanner characterChk = new Scanner(System.in);

        System.out.println("\n Please enter a Vowel or Consonant");
        String character = characterChk.next();

        if (Objects.equals(character, "A,E,I,O,U,a,e,i,o,u")) {
            System.out.println("\n This is a Vowel");
        } else {
            System.out.println("\n This is a Consonant");
        }

         */ //*** Check if Vowel or Consonant ***

        /*
        System.out.println('\n');
        System.out.println("*** Calculate Area Of A Circle ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);

         */ //*** Calculate Area Of A Circle ***

        /*
        System.out.println('\n');
        System.out.println("*** Add 5 Numbers Loop ***");

        Scanner numInput = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = numInput.nextInt();
            total += num;
        }

        System.out.println("The sum of the numbers is: " + total);

         */ //*** Add 5 Numbers Loop ***

        /*
        System.out.println('\n');
        System.out.println("*** Password Loop ***");

        //Create Scanner
        Scanner userInput = new Scanner(System.in);

        //Create variable and make it a string (For Password)
        String password;

        //While true = if this condition below is true, do this
        while (true) {

            //Ask for a password
            System.out.print("Enter password: ");

            //Variable password is set to = the input from the scanner
            password = userInput.nextLine();

            //If password is the same as Wakefield, do this
            if (password.equals("Wakefield")) {

                //if true, print this.
                System.out.println("Correct, Welcome!");
                break;

                //if false, print this.
            } else {
                System.out.println("Incorrect password. Try again.");
            }

         */ //*** Password Loop ***

        /*
        System.out.println('\n');
        System.out.println("*** Guess Random Number ***");
        while(true) {
            //Create New Scanner (User input)
            Scanner sc = new Scanner(System.in);

            //Make Random Number
            Random randomNumberGen = new Random();

            //Sets (randomNumber) to the number generated (randomNumberGen)
            int randomNumber = randomNumberGen.nextInt(100) + 1;

            //Variables
            int userInpNum;
            int guesses = 0;
            int correctGuesses = 0;

            //Do loop
            do {
                //Print Input a number
                System.out.println("Input a number:");

                //Sets (userInpNum) to the number the user input
                userInpNum = sc.nextInt();

                //Adds 1 to the guesses count
                guesses++;

                //If the userInpNum does not = to the random number
                if (userInpNum != randomNumber) {

                    //Print this
                    System.out.println("Nope! Try again!");

                    //If it does add 1 to (correctGuesses)
                }else {
                    correctGuesses++;
                }

                //If the number input is grater then the (randomNumber) Print this
                if (userInpNum > randomNumber) {
                    System.out.println("You number is to high");
                }
                //If the number input is smaller than the (randomNumber) Print this
                if (userInpNum < randomNumber) {
                    System.out.println("You number is to Low");
                }

                //If (guesses) is set to 5, exit the function
                if (guesses == 5) {
                    break;
                }

                //While (userInpNum) does not = to (randomNumber)
            } while (userInpNum != randomNumber);

            //If (userInpNum) is the same as (randomNumber), Print this
            if (userInpNum == randomNumber) {
                System.out.println("Well done! You guessed it!");
            }


          //Double the value of (avgAccuracy) is the same as double the value of correctGuesses then divide
          //guesses and times by 100 to get the avgAccuracy as a percentage



            double avgAccuracy = (double) correctGuesses / guesses * 100;

            //Print the following below
            System.out.println("You got " + correctGuesses + " correct guesses out of " + guesses + " total guesses.");
            System.out.println("Average accuracy: " + avgAccuracy + "%");

            //If (correctGuesses) is 0 print this and loop the game
            if(correctGuesses == 0) {
                System.out.println("No correct answers were given, the game will loop");
                continue;
            }
            break;
        }

         */ //*** Guess Random Number ***

        /*
        System.out.println('\n');
        System.out.println("*** Guess the percentage ***");

        //Generates a random number from 1 to 100
        Random rand = new Random();
        int percent = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int totalDifference = 0;
        int attempt = 1;

        while (attempt <= 3) {
            System.out.print("Please guess the percentage: ");
            int div = percent/10;
            StringBuilder bar = new StringBuilder("[");
            for(int i = 0 ; i < div ; i++) {
                bar.append("-");
            }
            bar.append("]");
            System.out.print(bar);
            int guess = sc.nextInt();
            if (guess == percent) {
                System.out.println("Congratulations! You guessed the correct percentage: " + percent + "%");
                break;
            } else {
                System.out.println("Sorry, the correct percentage was " + percent + "%");
                int difference = Math.abs(guess - percent);
                System.out.println("You were off by " + difference + "%");
                totalDifference += difference;
            }
            attempt++;
        }
        if (attempt == 4) {
            int averageDifference = totalDifference / 3;
            System.out.println("You took 3 attempts, your average difference was: "+ averageDifference + "%");
        }

          //*** Guess Random Percentage ***



         */ //*** Guess the percentage ***


    }
}





