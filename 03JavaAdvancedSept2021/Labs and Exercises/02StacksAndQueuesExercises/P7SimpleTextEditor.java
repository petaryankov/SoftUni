package day2.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P7SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int line = 1; line <= n; line++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            switch (command) {
                case "1":
                    String textToAppend = input[1];
                    text.append(textToAppend);
                    stack.push(textToAppend);
                    break;
                case "2":
                    //abv
                    int charsToErases = Integer.parseInt(input[1]);
                    int beginIndex = text.length() - charsToErases;
                    text = new StringBuilder(text.delete(beginIndex, text.length()));
                    stack.push(text.toString());
                    break;
                case "3":
                    int indexPosition = Integer.parseInt(input[1]) - 1;
                    System.out.println(text.charAt(indexPosition));
                    break;
                case "4":
                    stack.pop();
                    text = new StringBuilder(stack.peek());

                    break;
            }
        }
    }
}
