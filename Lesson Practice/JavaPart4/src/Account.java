public class Account {

    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Attributes
    protected String name;
    protected String accNo;
    protected double balance;
    protected double deposit;
    protected double withdraw;


    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Construct
    public Account(String name, String accNo, double balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Set Methods
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Get Methods
    public void getDeposit(){
        balance += deposit;
    }
    public void getWithdraw(){
        balance -= withdraw;
    }

    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Methods

    public void DisplayInfo(){

        System.out.println("Account Name is " + name);
        System.out.println("Account Number is " + accNo);
        System.out.printf("Account balance is £%.2f%n", balance);

    }
}
