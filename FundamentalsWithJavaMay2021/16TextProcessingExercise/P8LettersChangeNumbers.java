package day17TextProcessingExercise;

import java.util.Scanner;

public class P8LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double result = 0;
        for (String str : input) {
            double number = getStrSum(str);
            result += number;
        }

        System.out.printf("%.2f", result);
    }

    private static double getStrSum(String str) {
        double sum = 0;
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(str.length() - 1);
        double strToNumber = Double.parseDouble(str.substring(1, str.length() - 1));
        if (Character.isUpperCase(firstLetter)) {
            sum = strToNumber / (firstLetter - 64);
        } else if (Character.isLowerCase(firstLetter)) {
            sum = strToNumber * (firstLetter - 96);
        }
        if (Character.isUpperCase(secondLetter)) {
            sum -= (secondLetter - 64);
        } else if (Character.isLowerCase(secondLetter)) {
            sum += (secondLetter - 96);
        }
        return sum;
    }
}
