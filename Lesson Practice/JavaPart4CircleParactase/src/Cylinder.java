public class Cylinder extends Circle {

    // Attributes
    protected double height;
    protected double volume;

    // Construct
    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }

    // Set Methods
    public void setHeight(double height) {
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }

    // Get Methods
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * radius * height;
    }
}