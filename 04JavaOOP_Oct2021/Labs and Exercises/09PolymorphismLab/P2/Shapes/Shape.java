package day9.PolymorphismLab.P2.Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
