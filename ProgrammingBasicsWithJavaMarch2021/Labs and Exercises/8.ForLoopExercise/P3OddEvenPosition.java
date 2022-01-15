package day8ForLoopExercise;

import java.util.Scanner;

public class P3OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;

        double oddSum = 0;
        double oddMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());

            //even positions
            if (i % 2 == 0) {
                evenSum += currentNum;
                // if num is minimum
                if (currentNum < evenMin) {
                    evenMin = currentNum;
                }// maximum even
                if (currentNum > evenMax) {
                    evenMax = currentNum;
                }
                //odd positions
            } else {
                oddSum += currentNum;
                // if num is minimum
                if (currentNum < oddMin) {
                    oddMin = currentNum;
                }// maximum odd
                if (currentNum > oddMax) {
                    oddMax = currentNum;
                }
            }

        }
        System.out.printf("OddSum=%.2f,\n", oddSum);
        if (oddSum == 0) {
            System.out.println("OddMin=No,\nOddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,\nOddMax=%.2f,\n", oddMin, oddMax);
        }
        System.out.printf("EvenSum=%.2f,\n", evenSum);
        if (evenSum == 0) {
            System.out.println("EvenMin=No,\nEvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,\nEvenMax=%.2f", evenMin, evenMax);
        }
    }
}
