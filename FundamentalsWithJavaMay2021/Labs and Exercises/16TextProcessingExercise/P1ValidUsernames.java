package day17TextProcessingExercise;

import java.util.Scanner;

public class P1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String username : input) {
            if (username.length() >= 3 && username.length() <= 16) {
                int counter = 0;
                for (char symbol : username.toCharArray()) {
                    if (Character.isLetterOrDigit(symbol)
                            || (symbol == '-') || symbol == '_') {
                        counter++;
                        if (counter == username.length()) {
                            System.out.println(username);
                        }
                    }
                }
            }
        }
    }
}
