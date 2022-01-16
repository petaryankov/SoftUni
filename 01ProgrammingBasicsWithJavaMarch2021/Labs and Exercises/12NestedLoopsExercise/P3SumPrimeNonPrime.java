package day12NestedLoopsExercise;

import java.util.Scanner;

public class P3SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int nonPrime = 0;
        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean flag = false;
        while (!input.equals("stop")) {
            //String to number
            int number = Integer.parseInt(input);
            // negative numbers
            if (number < 0) {
                System.out.println("Number is negative.");
                //don't calculate negative numbers
                flag = true;

            }// condition for nonPrime and non negative numbers
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    nonPrimeSum += number;
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }//calculate prime numbers
            if (!flag) {
                primeSum += number;
            }// new number
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeSum);
    }
}
