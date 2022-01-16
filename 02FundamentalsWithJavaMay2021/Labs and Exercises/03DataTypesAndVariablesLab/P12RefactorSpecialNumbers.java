package day3DataTypesAndVariablesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfIterations = Integer.parseInt(scanner.nextLine());

        for (int digit = 1; digit <= numOfIterations; digit++) {
            int sum = 0;
            int currentNum = digit;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum /= 10;
            }
            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            String trueOrFalse = "False";
            if (isSpecialNum) {
                trueOrFalse = "True";
            }
            System.out.printf("%d -> %s%n", digit, trueOrFalse);
        }
    }
}
