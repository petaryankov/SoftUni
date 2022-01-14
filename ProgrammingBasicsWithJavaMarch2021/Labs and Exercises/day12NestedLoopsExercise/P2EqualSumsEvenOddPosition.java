package day12NestedLoopsExercise;

import java.util.Scanner;

public class P2EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int currentNum = i;
            for (int j = 6; j >= 1; j--) {
                // read the last digit
                int digit = currentNum % 10;
                //remove the last digit
                currentNum /= 10;
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i+" ");
            }

        }
    }
}
