package ExamsPreparation.Exam25June2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milkQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).forEach(milkQueue::offer);
        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).forEach(cacaoStack::push);

        int backingChoco = 0;
        int darkChoco = 0;
        int milkChoco = 0;
        while (milkQueue.size() > 0 && cacaoStack.size() > 0) {
            double currentMilk = milkQueue.peek();
            double currentCacao = cacaoStack.pop();

            double cacaoPercentage = currentCacao / (currentMilk + currentCacao) * 100;
            int result = (int) cacaoPercentage;
            if (result == 30) {
                milkChoco++;
                milkQueue.poll();

            } else if (result == 50) {
                darkChoco++;
                milkQueue.poll();
            } else if (result == 100) {
                backingChoco++;
                milkQueue.poll();
            } else {
                milkQueue.poll();
                milkQueue.offer(currentMilk + 10);
            }
        }
        if (milkChoco > 0 && darkChoco > 0 && backingChoco > 0) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        if (backingChoco > 0) {
            System.out.println("# Baking Chocolate --> " + backingChoco);
        }
        if (darkChoco > 0) {
            System.out.println("# Dark Chocolate --> " + darkChoco);
        }
        if (milkChoco > 0) {
            System.out.println("# Milk Chocolate --> " + milkChoco);
        }
    }
}
