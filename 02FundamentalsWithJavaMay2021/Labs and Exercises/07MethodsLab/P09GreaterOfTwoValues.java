package day7MethodsLab;

import java.util.Scanner;

public class P9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        checkInput(input, scanner);
    }

    private static void checkInput(String input, Scanner scanner) {
        if (input.equals("int")) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum, secondNum));
        } else if (input.equals("char")) {
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstChar, secondChar));
        } else if (input.equals("string")) {
            String firstStr = scanner.nextLine();
            String secondStr = scanner.nextLine();
            System.out.println(getMax(firstStr, secondStr));
        }
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
