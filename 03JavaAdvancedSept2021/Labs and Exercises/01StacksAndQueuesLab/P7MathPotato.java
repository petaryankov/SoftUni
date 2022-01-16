package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P7MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, input);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        while (queue.size() > 1) {
            counter++;
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());

            }
            if (isNonPrime(counter) || counter == 1) {
                System.out.println("Removed " + queue.poll());
            } else {
                System.out.println("Prime " + queue.peek());
            }

        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isNonPrime(int counter) {
        boolean flag = false;
        for (int j = 2; j <= counter / 2; ++j) {
            if (counter % j == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
