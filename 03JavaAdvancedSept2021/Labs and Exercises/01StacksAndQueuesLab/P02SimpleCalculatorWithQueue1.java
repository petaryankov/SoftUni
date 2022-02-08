package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> calculatorQueue = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).map(String::valueOf)
                .collect(Collectors.toCollection(ArrayDeque::new));

        while (calculatorQueue.size() > 1) {
            int num1 = Integer.parseInt(calculatorQueue.poll());
            String operator = calculatorQueue.poll();
            int num2 = Integer.parseInt(calculatorQueue.poll());
            int sum = operator.equals("+")
                    ? num1 + num2
                    : num1 - num2;
            calculatorQueue.offerFirst(String.valueOf(sum));
        }
        System.out.println(calculatorQueue.poll());
    }
}
