package ExamsPreparation.ExamRetakeExam18August2021;

import java.util.*;
import java.util.stream.Collectors;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> liquidsQueue = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> ingredientsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .forEach(ingredientsStack::push);

        int biscuit = 25;
        int cake = 50;
        int pastry = 75;
        int pie = 100;
        int biscuitCounter = 0;
        int cakeCounter = 0;
        int pastryCounter = 0;
        int pieCounter = 0;
        while (!ingredientsStack.isEmpty() && !liquidsQueue.isEmpty()) {
            int liquidInt = liquidsQueue.poll();
            int ingredientInt = ingredientsStack.pop();
            int sum = liquidInt + ingredientInt;
            if (sum == biscuit) {
                biscuitCounter++;
            } else if (sum == cake) {
                cakeCounter++;
            } else if (sum == pastry) {
                pastryCounter++;
            } else if (sum == pie) {
                pieCounter++;
            } else {
                ingredientsStack.addFirst(ingredientInt + 3);
            }
        }
        if (biscuitCounter > 0 && cakeCounter > 0
                && pastryCounter > 0 && pieCounter > 0) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        if (liquidsQueue.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            String liquidsPrint = liquidsQueue.stream().map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println("Liquids left: " + liquidsPrint);
        }
        if (ingredientsStack.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            String ingredientsPrint = ingredientsStack.stream().map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println("Ingredients left: " + ingredientsPrint);
        }
        System.out.println("Biscuit: " + biscuitCounter);
        System.out.println("Cake: " + cakeCounter);
        System.out.println("Pie: " + pieCounter);
        System.out.println("Pastry: " + pastryCounter);
    }
}
