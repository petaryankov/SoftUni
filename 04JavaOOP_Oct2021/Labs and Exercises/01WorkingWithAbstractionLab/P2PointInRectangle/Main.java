package day1.WorkingWithAbstractionLab.P2.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = readArray(scanner);
        Point pointBottomLeftXY = new Point(coordinates[0], coordinates[1]);
        Point pointTopRightXY = new Point(coordinates[2], coordinates[3]);
        Rectangle rectangle = new Rectangle(pointBottomLeftXY, pointTopRightXY);
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            int[] XY = readArray(scanner);
            Point pointToCheck = new Point(XY[0], XY[1]);
            System.out.println(rectangle.contain(pointToCheck));
        }

    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
