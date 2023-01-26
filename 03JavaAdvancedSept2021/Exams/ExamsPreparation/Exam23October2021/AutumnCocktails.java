package ExamsPreparation.Exam23October2021.P1;

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

        while (!freshnessStack.isEmpty() && !ingredientsQueue.isEmpty()) {
            int addIngredients = ingredientsQueue.peek();
            if (addIngredients == 0) {
                ingredientsQueue.poll();
                continue;
            }
            int addFreshness = freshnessStack.pop();
            int cocktail = addFreshness * addIngredients;

            switch (cocktail) {
                case 150:
                    String pearSourName = "Pear Sour";
                    if (cocktails.containsKey(pearSourName)) {
                        cocktails.put(pearSourName, cocktails.get(pearSourName) + 1);
                    } else {
                        cocktails.put(pearSourName, 1);
                    }
                    ingredientsQueue.poll();
                    break;
                case 250:
                    String theHarvestName = "The Harvest";
                    if (cocktails.containsKey(theHarvestName)) {
                        cocktails.put(theHarvestName, cocktails.get(theHarvestName) + 1);
                    } else {
                        cocktails.put(theHarvestName, 1);
                    }
                    ingredientsQueue.poll();
                    break;
                case 300:
                    String appleHinnyName = "Apple Hinny";
                    if (cocktails.containsKey(appleHinnyName)) {
                        cocktails.put(appleHinnyName, cocktails.get(appleHinnyName) + 1);
                    } else {
                        cocktails.put(appleHinnyName, 1);
                    }
                    ingredientsQueue.poll();
                    break;
                case 400:
                    String highFashionName = "High Fashion";
                    if (cocktails.containsKey(highFashionName)) {
                        cocktails.put(highFashionName, cocktails.get(highFashionName) + 1);
                    } else {
                        cocktails.put(highFashionName, 1);
                    }
                    ingredientsQueue.poll();
                    break;
                default:
                    int ingredientToRemove = ingredientsQueue.poll();
                    int ingredientToAdd = ingredientToRemove + 5;
                    ingredientsQueue.addLast(ingredientToAdd);
                    break;
            }
        }
        if (cocktails.size() == 4) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if (!ingredientsQueue.isEmpty()) {
            System.out.println("Ingredients left: " + ingredientsQueue.stream().mapToInt(Integer::intValue).sum());
        }

        if (!cocktails.isEmpty()) {
            cocktails.forEach((key, value) -> System.out.println("# " + key + " --> " + value));
        }
    }
}
