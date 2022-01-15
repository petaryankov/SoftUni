package day7MethodsLab;

import java.util.Scanner;

public class P3PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high = Integer.parseInt(scanner.nextLine());

        positiveHalf(high);
        negativeHalf(high);
    }

    private static void positiveHalf(int high) {
        for (int i = 1; i < high; i++) {
            printSingleLine(i);
        }
    }

    private static void negativeHalf(int high) {
        for (int i = high; i > 0; i--) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
