package day8MethodsExercise;

import java.util.Scanner;

public class P2VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printCountVowels(input.toLowerCase());
    }

    private static void printCountVowels(String input) {
        int vowelCounter = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == 'a' || input.charAt(index) == 'e'
                    || input.charAt(index) == 'i' || input.charAt(index) == 'o'
                    || input.charAt(index) == 'u') {
                vowelCounter++;
            }
        }
        System.out.println(vowelCounter);
    }
}
