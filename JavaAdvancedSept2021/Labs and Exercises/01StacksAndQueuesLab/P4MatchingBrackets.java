package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P4MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == '(') {
                stack.push(i);
            } else if (symbol == ')') {
                int startIndex = stack.pop();
                int endIndex = i + 1;
                String substring = expression.substring(startIndex, endIndex);
                System.out.println(substring);
            }
        }

    }
}
