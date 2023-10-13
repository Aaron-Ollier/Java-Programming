import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account AaronAccount = new Account("Aaron Ollier", "0564723495", 10.99);

        AaronAccount.DisplayInfo();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit number: ");
        double getDeposit = sc.nextDouble();

        AaronAccount.setDeposit(getDeposit);
        AaronAccount.getDeposit();

        System.out.println("You have *DEPOSITED*: " + "+ £" + getDeposit);
        AaronAccount.DisplayInfo();

        Scanner scc = new Scanner(System.in);
        System.out.print("Enter withdraw number: ");
        double getWithdraw = scc.nextDouble();

        AaronAccount.setWithdraw(getWithdraw);
        AaronAccount.getWithdraw();

        System.out.println("You have *WITHDRAWN*: " + "- £" + getWithdraw);
        AaronAccount.DisplayInfo();

        SavingsAccount SavingAaronOllier = new SavingsAccount ("Aaron Ollier", "0564723495", 10.99, 30.0);
        SavingsAccount.DisplayInterest();

        Car b1 = new Car();
        b1.color = "Blue";
        b1.speed = 200;
        b1.size = 22;
        b1.CC = 1000;
        b1.gears = 5;
        b1.attributesCar();
    }
}
