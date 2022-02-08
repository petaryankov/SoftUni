package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> urlStack = new ArrayDeque<>();
        ArrayDeque<String> forwardUrlStack = new ArrayDeque<>();
        while (!input.equals("Home")) {

            switch (input) {
                case "back":
                   if (urlStack.size() <= 1) {
                       System.out.println("no previous URLs");
                   } else {
                       String forwardUrl = urlStack.pop();
                       forwardUrlStack.push(forwardUrl);
                       System.out.println(urlStack.peek());
                   }
                    break;
                case "forward":
                    if (forwardUrlStack.isEmpty()) {
                        System.out.println("no next URLs");
                    } else {
                        String toUrlStack = forwardUrlStack.pop();
                        urlStack.push(toUrlStack);
                        System.out.println(toUrlStack);
                    }
                    break;
                default:
                    System.out.println(input);
                    urlStack.push(input);
                    forwardUrlStack.clear();
            }

            input = scanner.nextLine();
        }
    }
}
