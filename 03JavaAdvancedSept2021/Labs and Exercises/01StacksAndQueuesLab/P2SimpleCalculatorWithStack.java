package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P2SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> calculator = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = input.length - 1; i >= 0; i--) {
            calculator.push(input[i]);
        }

        while (calculator.size() > 1) {
            int number1 = Integer.parseInt(calculator.pop());
            String operator = calculator.pop();
            int number2 = Integer.parseInt(calculator.pop());
            int sum = operator.equals("+")
                    ? number1 + number2
                    : number1 - number2;
            calculator.push(String.valueOf(sum));
        }
        System.out.println(calculator.pop());
    }
}
