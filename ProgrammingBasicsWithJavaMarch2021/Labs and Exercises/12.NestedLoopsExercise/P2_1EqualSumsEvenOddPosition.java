package day12NestedLoopsExercise;

import java.util.Scanner;

public class P2_1EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    oddSum += currentDigit;
                } else {
                    evenSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }

        }

    }
}
