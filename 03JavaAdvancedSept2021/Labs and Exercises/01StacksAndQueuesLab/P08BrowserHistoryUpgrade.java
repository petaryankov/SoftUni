package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P8BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> historyUrls = new ArrayDeque<>();
        ArrayDeque<String> stackForward = new ArrayDeque<>();
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                backUrl(historyUrls, stackForward);
            } else if (input.equals("forward")) {
                forwardUrl(stackForward, historyUrls);
            } else {
                System.out.println(input);
                historyUrls.push(input);
                stackForward.clear();
            }
            input = scanner.nextLine();
        }
    }

    private static void forwardUrl(ArrayDeque<String> stackForward, ArrayDeque<String> stackBack) {
        if (stackForward.isEmpty()) {
            System.out.println("no next URLs");
        } else {
            System.out.println(stackForward.peek());
            stackBack.push(stackForward.pop());

        }
    }

    private static void backUrl(ArrayDeque<String> stackBack, ArrayDeque<String> stackForward) {
        if (stackBack.size() <= 1) {
            System.out.println("no previous URLs");
        } else {
            stackForward.push(stackBack.pop());
            System.out.println(stackBack.peek());
        }
    }
}
