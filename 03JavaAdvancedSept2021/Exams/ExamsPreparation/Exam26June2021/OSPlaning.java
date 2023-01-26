package ExamsPreparation.Exam26June2021;

import java.util.*;
import java.util.stream.Collectors;

public class OSPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> taskStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).forEach(taskStack::push);

        Deque<Integer> threadQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        int kill = Integer.parseInt(scanner.nextLine());

        while (!taskStack.isEmpty()) {
            int taskValue = taskStack.peek();
            int threadValue = threadQueue.peek();
            if (kill == taskValue) {
                System.out.printf("Thread with value %d killed task %d\n"
                        , threadValue, taskValue);
                threadQueue.forEach(e -> System.out.printf("%d ", e));
                return;
            }
            if (threadValue >= taskValue) {
                taskStack.pop();
            }
            threadQueue.poll();

        }

    }
}
