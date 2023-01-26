package ExamsPreparation.Exam20February2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> firstBoxQueue = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> secondBoxStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).forEach(secondBoxStack::push);

        Deque<Integer> claimedStack = new ArrayDeque<>();
        while (!firstBoxQueue.isEmpty() && !secondBoxStack.isEmpty()) {
            int firstBoxNum = firstBoxQueue.peek();
            int secondBoxNum = secondBoxStack.pop();
            int sum = firstBoxNum + secondBoxNum;
            if (sum % 2 == 0) {
                claimedStack.push(sum);
                firstBoxQueue.poll();
            } else {
                firstBoxQueue.addLast(secondBoxNum);
            }
        }
        String firsOrSecondEmpty = firstBoxQueue.isEmpty() ? "First magic box is empty."
                : "Second magic box is empty.";
        System.out.println(firsOrSecondEmpty);
        int sum = claimedStack.stream().mapToInt(Integer::intValue).sum();
        String quality = sum >= 90 ? "Wow, your prey was epic! Value: " + sum
                : "Poor prey... Value: " + sum;
        System.out.println(quality);
    }
}
