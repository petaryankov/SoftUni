package day2BasicSyntaxCondStatAndLoopsExercise;

import java.util.Scanner;

public class P5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        boolean isPassword = false;
        StringBuilder passwordBuilder = new StringBuilder();
        int counter = 0;
        //revers username
        for (int i = username.length() - 1; i >= 0; i--) {
            passwordBuilder.append(username.charAt(i));
        }
        String correctPass = passwordBuilder.toString();
        while (!password.equals(correctPass)) {
            counter++;
            if (counter > 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }
        if (password.equals(correctPass)) {
            System.out.printf("User %s logged in.",username);
        }
    }
}
