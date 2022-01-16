package day7MethodsLab;

import java.util.Scanner;

public class P10MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double total = calculate(firstNum, operator, secondNum);
        System.out.printf("%.0f", total);
    }

    private static double calculate(int firstNum, String operator, int secondNum) {
        double sum = 0;
        if (operator.equals("+")) {
            sum = firstNum + secondNum;
        } else if (operator.equals("-")) {
            sum = firstNum - secondNum;
        } else if (operator.equals("*")) {
            sum = firstNum * secondNum;
        } else if (operator.equals("/")) {
            sum = 1.0 * firstNum / secondNum;
        }
        return sum;
    }
}
