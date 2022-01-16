package day15MapsLambdaAndStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P4Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productWithPrice = new LinkedHashMap<>();
        Map<String, Integer> productWithQuantity = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double productPrice = Double.parseDouble(input.split(" ")[1]);
            int productQuantity = Integer.parseInt(input.split(" ")[2]);
            productWithPrice.put(product, productPrice);
            if (!productWithQuantity.containsKey(product)) {
                productWithQuantity.put(product, productQuantity);
            } else if (productWithQuantity.containsKey(product)) {
                productWithQuantity.put(product, productWithQuantity.get(product) + productQuantity);
            }

            input = scanner.nextLine();
        }
        productWithPrice.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key
                , value * productWithQuantity.get(key)));
    }
}
