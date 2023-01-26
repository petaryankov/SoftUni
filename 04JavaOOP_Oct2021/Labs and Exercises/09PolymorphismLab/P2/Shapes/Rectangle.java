package day9.PolymorphismLab.P2.Shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
