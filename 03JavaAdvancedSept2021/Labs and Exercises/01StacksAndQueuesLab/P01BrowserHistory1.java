package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> urlStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            switch (input) {
                case "back":
                    if (urlStack.size() <= 1) {
                        System.out.println("no previous URLs");
                    } else {
                        urlStack.pop();
                        System.out.println(urlStack.peek());
                    }
                    break;
                default:
                    urlStack.push(input);
                    System.out.println(input);
                    break;
            }
            input = scanner.nextLine();
        }

    }
}
