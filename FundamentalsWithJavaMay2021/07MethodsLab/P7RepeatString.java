package day7MethodsLab;

import java.util.Scanner;

public class P7RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String result = repeatInput(input, n);
        System.out.println(result);
    }

    private static String repeatInput(String input, int n) {
        return String.valueOf(input).repeat(Math.max(0, n));
    }
}
