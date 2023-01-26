package ExamsPreparation.Exam22Feb2020;

import java.util.*;
import java.util.stream.Collectors;

public class Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque <Integer> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .forEach(stack::push);
                List<Integer> box = new ArrayList<>();
        while (!queue.isEmpty() && !stack.isEmpty()) {
            int queueInt = queue.peek();
            int stackInt = stack.pop();
            int sum = queueInt + stackInt;
            if (sum % 2 == 0) {
                box.add(sum);
                queue.poll();
            } else {
                queue.addLast(stackInt);
            }
        }
        if (queue.isEmpty()) {
            System.out.println("First lootbox is empty");
        }
        if (stack.isEmpty()) {
            System.out.println("Second lootbox is empty");
        }
        int sum = box.stream().mapToInt(Integer::intValue).sum();
        if (sum >= 100) {
            System.out.println("Your loot was epic! Value: " + sum);
        } else {
            System.out.println("Your loot was poor... Value: " + sum);
        }
    }
}
