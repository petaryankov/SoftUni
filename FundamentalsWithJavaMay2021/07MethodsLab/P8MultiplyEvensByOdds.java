package day7MethodsLab;

import java.util.Scanner;

public class P8MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evensSum = getSumOfEvenDigits(number);
        int odsSum = getSumOfOddDigits(number);
        return evensSum * odsSum;
    }

    private static int getSumOfOddDigits(int number) {
        int sumOds = 0;
        while (number > 0) {
            int currentNum = number % 10;
            number /= 10;
            if (currentNum % 2 != 0) {
                sumOds += currentNum;
            }
        }
        return sumOds;
    }

    private static int getSumOfEvenDigits(int number) {
        int sumEvens = 0;
        while (number > 0) {
            int currentNum = number % 10;
            number /= 10;
            if (currentNum % 2 == 0) {
                sumEvens += currentNum;
            }
        }
        return sumEvens;
    }
}
