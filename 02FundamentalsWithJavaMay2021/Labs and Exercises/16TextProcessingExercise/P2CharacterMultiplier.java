package day17TextProcessingExercise;

import java.util.Scanner;

public class P2CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String firstStr = input[0];
        String secondStr = input[1];
        int sum = calculateStr(firstStr, secondStr);
        System.out.println(sum);

    }

    private static int calculateStr(String str1, String str2) {
        int result = 0;
        int minLength = Math.min(str1.length(), str2.length());
        int maxLength = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < minLength) {
                result += str1.charAt(i) * str2.charAt(i);
            } else if (str1.length() > str2.length()) {
                result += str1.charAt(i);
            } else {
                result += str2.charAt(i);
            }
        }
        return result;
    }

}
