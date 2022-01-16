package day1.WorkingWithAbstractionLab.P2.PointInRectangle;

public class Rectangle {
    private Point bottomLeftXY;
    private Point topRightXY;

    public Rectangle(Point bottomLeftXY, Point topRightXY) {
        this.bottomLeftXY = bottomLeftXY;
        this.topRightXY = topRightXY;
    }

    public boolean contain(Point pointToCheck) {
        return this.bottomLeftXY.getCoordinatesX() <= pointToCheck.getCoordinatesX()
                && this.bottomLeftXY.getCoordinatesY() <= pointToCheck.getCoordinatesY()
                && this.topRightXY.getCoordinatesX() >= pointToCheck.getCoordinatesX()
                && this.topRightXY.getCoordinatesY() >= pointToCheck.getCoordinatesY();
    }
}
