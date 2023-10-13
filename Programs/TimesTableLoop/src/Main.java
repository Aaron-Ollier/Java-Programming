import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter a whole number");
        Scanner userInpNum = new Scanner(System.in);
        long  timesTableNum = userInpNum.nextLong();
        for (int i = 1; i <= 12; i++ ) {

            System.out.println(timesTableNum + " x " + i + " = " + (timesTableNum * i));

        }
    }
}