package day8MethodsExercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTopNumber(number);
    }

    private static void printTopNumber(int number) {
        if (number < 0) {
            for (int i = number; i < 0; i++) {
                if (isNumberValid(i) && isSumValid(i)) {
                    System.out.println(i);
                }
            }
        }
        for (int i = 1; i <= number; i++) {
            if (isNumberValid(i) && isSumValid(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isSumValid(int number) {
        int sum = 0;
        while (number != 0) {
            int currentNum = number;
            currentNum %= 10;
            sum += currentNum;

            number /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean isNumberValid(int number) {
        while (number != 0) {
            int currentNum = number;
            currentNum %= 10;
            if (currentNum % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
