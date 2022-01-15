package day8MethodsExercise;

import java.util.Scanner;

public class P4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        passwordValidator(password);

    }

    public static void passwordValidator(String password) {
        boolean isValidLength = isValidPasswordLength(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidContent = isValidPasswordContent(password);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isDigitsTrue = isPasswordDigits(password);
        if (!isDigitsTrue) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength && isValidContent && isDigitsTrue) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidPasswordLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isValidPasswordContent(String password) {
        for (int index = 0; index <= password.length() - 1; index++) {
            char currentSymbol = password.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPasswordDigits(String password) {
        int counterDigits = 0;
        for (int index = 0; index <= password.length() - 1; index++) {
            char digitChecker = password.charAt(index);
            if (Character.isDigit(digitChecker))
                counterDigits++;
        }
        return counterDigits >= 2;

    }
}
