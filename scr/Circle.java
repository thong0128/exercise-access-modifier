public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
