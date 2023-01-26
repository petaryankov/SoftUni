package MyFirstExam23October2021;

import java.util.*;
import java.util.stream.Collectors;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> ingredientsQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> freshnessStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .forEach(freshnessStack::push);
        Map<String, Integer> cocktails = new TreeMap<>();

        int pearSour = 0;
        int theHarvest = 0;
        int appleHinny = 0;
        int highFashion = 0;
        while (!ingredientsQueue.isEmpty() && !freshnessStack.isEmpty()) {
            int ingredient = ingredientsQueue.peek();
            int level = freshnessStack.peek();
            if (ingredient == 0) {
                ingredientsQueue.poll();
                continue;
            }
            int multiplication = ingredient * level;
            //Pear Sour
            if (multiplication == 150) {
                ingredientsQueue.poll();
                freshnessStack.pop();
                pearSour++;
            //The Harvest
            } else if (multiplication == 250) {
                ingredientsQueue.poll();
                freshnessStack.pop();
                theHarvest++;
            //Apple Hinny
            } else if (multiplication == 300) {
                ingredientsQueue.poll();
                freshnessStack.pop();
                appleHinny++;
            //High Fashion
            } else if (multiplication == 400) {
                ingredientsQueue.poll();
                freshnessStack.pop();
                highFashion++;
            } else {
                int freshnessLevel = freshnessStack.pop();
                int ingredientValue = ingredientsQueue.poll() + 5;
                ingredientsQueue.addLast(ingredientValue);
            }
        }
        boolean isSucceeded = pearSour != 0 && theHarvest != 0
                && appleHinny != 0 && highFashion != 0;
        if (isSucceeded) {
            System.out.println("It's party time! The cocktails are ready!");
            cocktails.put("Pear Sour", pearSour);
            cocktails.put("The Harvest", theHarvest);
            cocktails.put("Apple Hinny", appleHinny);
            cocktails.put("High Fashion", highFashion);
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
            if (pearSour != 0) {
                cocktails.put("Pear Sour", pearSour);
            }
            if (theHarvest != 0) {
                cocktails.put("The Harvest", theHarvest);
            }
            if (appleHinny != 0) {
                cocktails.put("Apple Hinny", appleHinny);
            }
            if (highFashion != 0) {
                cocktails.put("High Fashion", highFashion);
            }
        }
        if (!ingredientsQueue.isEmpty()) {
            int sum = 0;
            while (!ingredientsQueue.isEmpty()) {
                sum += ingredientsQueue.poll();
            }
            System.out.println("Ingredients left: " + sum);
        }
        //" # {cocktail name} --> {amount}"
        cocktails.forEach((key, value) -> System.out.printf("# %s --> %d\n", key, value));
    }
}
