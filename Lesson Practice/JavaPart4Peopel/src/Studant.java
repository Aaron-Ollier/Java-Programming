public class Studant extends People {

    // Attributes
    protected String program;
    protected int year;
    protected double fee;

    // Construct
    public Studant (String name, String address, int year, double fee, String program) {
        super(name, address);
        this.year = year;
        this.program = program;
        this.fee = fee;
    }

    // Set Methods
    public void setYear(int year) {
        this.year = year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    // Get Methods
    public int getYear() {
        return year;
    }

    public String getProgram() {
        return program;
    }

    public double getFee() {
        return fee;
    }


    // Methods
    public void displayInfoStudant() {
        System.out.println(name + " is your name!");
        System.out.println( name + " is in year " + year);
        System.out.println(name + " has taken " + program);
        System.out.println(name + " has paid " + "£" + fee + " for this program");
    }
}
