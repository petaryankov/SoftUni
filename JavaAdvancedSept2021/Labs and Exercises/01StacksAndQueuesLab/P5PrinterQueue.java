package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P5PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!command.equals("print")) {

            if (command.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(command);
            }

            command = scanner.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
