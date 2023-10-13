public class People {
    // Attributes
    protected String name;
    protected String address;

    // Construct
    public People (String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Set Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Get Methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Methods

    public void displayInfo() {
        System.out.println(name + " is your name!");
        System.out.println(address + " is your address!");
    }

}
