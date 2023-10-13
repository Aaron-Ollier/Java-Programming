public class Staff extends People {

    // Attributes
   protected String school;
   protected double pay;

    // Construct
    public Staff (String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;

    }

    // Set Methods
    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    // Get Methods
    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    // Methods
    public void displayInfoStaff() {
        System.out.println(name + " is your name!");
        System.out.println(address + " is your address!");
        System.out.println(school + " is the school " + name + " works at.");
        System.out.println(name + " is payed " + "£" + pay + ".");
    }
}
