package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P1BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> historyUrl = new ArrayDeque<>();
        String currentUrl = "";

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (historyUrl.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
                currentUrl= historyUrl.pop();

            } else {
                if (!currentUrl.equals("")) {
                    historyUrl.push(currentUrl);
                }
                currentUrl = input;
            }
            System.out.println(currentUrl);
            input = scanner.nextLine();
        }
    }
}
