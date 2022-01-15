package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P4SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLines = Integer.parseInt(scanner.nextLine());
        int characterSum = 0;
        for (int symbol = 1; symbol <= numOfLines; symbol++) {
            char character = scanner.nextLine().charAt(0);
            characterSum += character;
        }
        System.out.printf("The sum equals: %d", characterSum);
    }
}
