package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> playersQueue = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::valueOf).collect(Collectors.toCollection(ArrayDeque::new));
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
