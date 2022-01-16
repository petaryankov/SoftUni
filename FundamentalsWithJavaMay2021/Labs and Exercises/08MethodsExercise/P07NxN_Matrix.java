package day8MethodsExercise;

import java.util.Scanner;

public class P7NxN_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        printsNxnMatrix(input);

    }

    public static void printsNxnMatrix(int number) {
        for (int i = 1; i <= number; i++) {
            printOneLine(number);
        }
    }

    public static void printOneLine(int number) {
        System.out.println((number + " ").repeat(Math.max(0, number)));
    }
}
