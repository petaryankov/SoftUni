package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P6HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        ArrayDeque<String> playersQueue = new ArrayDeque<>();
        for (String name : names) {
            playersQueue.offer(name);
        }
        //Sam John Sara
        int count = Integer.parseInt(scanner.nextLine());
        while (playersQueue.size() > 1) {
            for (int i = 1; i < count; i++) {
                playersQueue.offer(playersQueue.poll());
            }
            System.out.println("Removed " + playersQueue.pollFirst());
        }
        System.out.println("Last is " + playersQueue.poll());
    }
}
