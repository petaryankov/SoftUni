package day8MethodsExercise;

import java.util.Scanner;

public class P9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));

            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String number) {
        return getReversedNumber(number).equals(number);
    }

    public static String getReversedNumber(String number) {
        StringBuilder palindrome = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            palindrome.append(number.charAt(i));
        }
        return palindrome.toString();
    }
}
