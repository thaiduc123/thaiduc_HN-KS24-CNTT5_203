public class Circle implements Shape {
    private double radius;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArena() {
        return 3.14 * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * 3.14;
    }
}