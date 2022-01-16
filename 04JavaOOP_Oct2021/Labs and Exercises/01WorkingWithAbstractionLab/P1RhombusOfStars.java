package day1.WorkingWithAbstractionLab;

import java.util.Scanner;

public class P1RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printFigure(n);

    }

    private static void printFigure(int n) {
        printFirstPart(n);
        printMiddlePart(n);
        printLastPart(n);
    }

    private static void printLastPart(int n) {
        for (int row = 1; row < n; row++) {
            printSpace(row);
            printStars(n - row);
            System.out.println();
        }
    }

    private static void printSpace(int count) {
        for (int col = 0; col < count; col++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }

    private static void printMiddlePart(int n) {
        printStars(n);
        System.out.println();
    }

    private static void printFirstPart(int n) {
        for (int row = 1; row < n; row++) {
            printSpace(n - row);
            printStars(row);
            System.out.println();
        }
    }
}