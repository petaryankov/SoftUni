package day17TextProcessingExercise;

import java.util.Scanner;

public class P7StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int strength = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '>') {
                int currentStrength = Character.getNumericValue(input.charAt(i + 1));
                strength += currentStrength;
               result.append(currentChar);
            } else if (strength== 0) {
                result.append(currentChar);
            } else {
                strength--;
            }
        }
        System.out.println(result);
    }
}
