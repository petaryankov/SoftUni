package day5NestedConditionalStatements;

import java.util.Scanner;

public class P5SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                result += 0.50;
            } else if (product.equals("water")) {
                result += 0.80;
            } else if (product.equals("beer")) {
                result += 1.20;
            } else if (product.equals("sweets")) {
                result += 1.45;
            } else {
                result += 1.60;
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                result += 0.40;
            } else if (product.equals("water")) {
                result += 0.70;
            } else if (product.equals("beer")) {
                result += 1.15;
            } else if (product.equals("sweets")) {
                result += 1.30;
            } else {
                result += 1.50;
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                result += 0.45;
            } else if (product.equals("water")) {
                result += 0.70;
            } else if (product.equals("beer")) {
                result += 1.10;
            } else if (product.equals("sweets")) {
                result += 1.35;
            } else {
                result += 1.55;
            }

        }
        result *= quantity;
        System.out.println(result);
    }
}
