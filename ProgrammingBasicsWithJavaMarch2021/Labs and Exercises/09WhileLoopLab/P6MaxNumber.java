package day9WhileLoopLab;

import java.util.Scanner;

public class P6MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maximum = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (maximum < number) {
                maximum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(maximum);
    }
}
