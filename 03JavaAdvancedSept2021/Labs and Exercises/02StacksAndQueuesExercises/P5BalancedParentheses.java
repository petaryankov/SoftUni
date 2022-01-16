package day2.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P5BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '{' || symbol == '(' || symbol == '[') {
                stack.push(symbol);
            } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }
                char toPop = stack.pop();
                if (toPop == '(' && symbol == ')') {
                    flag = true;
                } else if (toPop == '{' && symbol == '}') {
                    flag = true;
                } else if (toPop == '[' && symbol == ']') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
