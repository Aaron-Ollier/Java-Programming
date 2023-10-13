public class Circle {

    // Attributes
    protected String color;
    protected double radius;
    protected double area;

    // Construct
    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    // Set Methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    // Get Methods
    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }
}