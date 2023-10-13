public class SavingsAccount extends Account {
    private double interest;
    public SavingsAccount(String name, String accNo, double balance, double interest){
        super(name, accNo, balance);
        this.interest = interest;
    }
    public void DisplayInterest(){
        System.out.println("Thi interest rate is " + interest);
    }
}