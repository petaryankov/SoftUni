package day16TextProcessingLab;

import java.util.Scanner;

public class P1ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
                String reversed = "";
            for (int i = input.length() -1; i >= 0; i--) {
                char append = input.charAt(i);
                reversed += append;
            }
            System.out.println(input + " = " + reversed);
            input = scanner.nextLine();
        }
    }
}
