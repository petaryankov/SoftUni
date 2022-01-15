package day8MethodsExercise;

import java.util.Scanner;

public class P6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printTheMiddleCharacter(input);
    }

    public static void printTheMiddleCharacter(String text) {
        int middleSymbol = text.length() / 2 - 1;
        if (text.length() % 2 == 0) {
            text = text.charAt(middleSymbol) + "" + text.charAt(middleSymbol + 1);
        } else {
            text = text.charAt(middleSymbol + 1) + "";
        }
        System.out.println(text);
    }
}
