package day5.SetsAndMapsAdvancedLab;

import java.util.*;

public class P06ProductShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Double>> shopsWithProducts = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] shopsData = input.split(", ");
            String shopName = shopsData[0];
            String product = shopsData[1];
            Double price = Double.parseDouble(shopsData[2]);

            shopsWithProducts.putIfAbsent(shopName, new LinkedHashMap<>());

            shopsWithProducts.get(shopName).put(product, price);

            input = scanner.nextLine();
        }
        shopsWithProducts.forEach((key, value) -> {
            System.out.println(key + "->");
            value.forEach((key1, value1) -> System.out.printf("Product: %s, Price: %.1f\n"
                    , key1, value1));
        });
    }

}

