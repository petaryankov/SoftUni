package day3ConditionalStatements;

import java.util.Scanner;

public class P6AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double sideA;
        double sideB;
        double sum;

        if (figure.equals("square")) {
            sideA = Double.parseDouble(scanner.nextLine());
            sum = sideA * sideA;
            System.out.printf("%.3f", sum);
        }
        if (figure.equals("rectangle")) {
            sideA = Double.parseDouble(scanner.nextLine());
            sideB = Double.parseDouble(scanner.nextLine());
            sum = sideA * sideB;
            System.out.printf("%.3f", sum);
        }
        if (figure.equals("circle")) {
            sideA = Double.parseDouble(scanner.nextLine());
            sum = sideA * sideA * Math.PI;
            System.out.printf("%.3f", sum);
        }
        if (figure.equals("triangle")) {
            sideA = Double.parseDouble(scanner.nextLine());
            sideB = Double.parseDouble(scanner.nextLine());
            sum = (sideA * sideB) / 2;
            System.out.printf("%.3f", sum);
        }

    }
}
