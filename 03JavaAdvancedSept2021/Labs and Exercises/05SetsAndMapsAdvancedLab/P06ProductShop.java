package day5.SetsAndMapsAdvancedLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P6ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shopsData = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String shopName = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);
            shopsData.putIfAbsent(shopName,new LinkedHashMap<>());
            Map<String, Double> productAndPrice = shopsData.get(shopName);
            productAndPrice.put(product, price);

            input = scanner.nextLine();
        }
        for (String shop : shopsData.keySet()) {
            System.out.println(shop + "->");
            for (var productPrice : shopsData.get(shop).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n"
                        , productPrice.getKey(), productPrice.getValue());
            }
        }
    }
}
