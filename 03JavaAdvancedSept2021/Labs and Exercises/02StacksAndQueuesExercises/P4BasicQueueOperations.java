package day2.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P4BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toOffer = scanner.nextInt();
        int toPoll = scanner.nextInt();
        int toCheck = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i =1; i <= toOffer; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 1; i <= toPoll; i++) {
            queue.poll();
        }
        if (queue.contains(toCheck)) {
            System.out.println(true);
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
