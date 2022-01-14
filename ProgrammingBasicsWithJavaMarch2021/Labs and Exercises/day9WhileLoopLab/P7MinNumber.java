package day9WhileLoopLab;

import java.util.Scanner;

public class P7MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int minimum = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (minimum > number) {
                minimum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minimum);
    }
}
