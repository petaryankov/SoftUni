package day17TextProcessingExercise;

import java.util.Scanner;

public class P4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encrypted = new StringBuilder();
        for (char symbol : text.toCharArray()) {
            int encryptedChar = symbol +3;
            encrypted.append((char)(encryptedChar));
        }
        System.out.println(encrypted);
    }
}
