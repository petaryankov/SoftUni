package day4.EncapsulationExercises.P4.PizzaCalories;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split("\\s+");

        Pizza pizza = null;
        String pizzaName = pizzaInfo[1];
        int numOfToppings = Integer.parseInt(pizzaInfo[2]);
        try {
            pizza = new Pizza(pizzaName, numOfToppings);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String[] doughInfo = scanner.nextLine().split("\\s+");

        Dough dough = null;
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double weightInGrams = Double.parseDouble(doughInfo[3]);
        try {
            dough = new Dough(flourType, bakingTechnique, weightInGrams);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Map<String, Topping> toppings = new LinkedHashMap<>();
        String toppingInput = scanner.nextLine();
        while (!toppingInput.equals("END")) {
            String[] toppingInfo = toppingInput.split("\\s+");
            String toppingType = toppingInfo[1];
            double toppingInGrams = Double.parseDouble(toppingInfo[2]);
            try {
                Topping topping = new Topping(toppingType, toppingInGrams);
                pizza.addTopping(topping);
                toppings.put(toppingType, topping);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            toppingInput = scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizzaName, pizza.getOverallCalories());
    }
}
