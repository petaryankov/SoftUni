package day7MethodsLab;

import java.util.Scanner;

public class P5Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());
        calculateTotalPrice(product, quantity);
    }

    private static void calculateTotalPrice(String product, Double quantity) {
        double totalPrice = 0.0;
        if (product.equals("coffee")) {
            totalPrice = quantity * 1.50;
        } else if (product.equals("water")) {
            totalPrice = quantity * 1.00;
        } else if (product.equals("coke")) {
            totalPrice = quantity * 1.40;
        } else if (product.equals("snacks")) {
            totalPrice = quantity * 2.00;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
