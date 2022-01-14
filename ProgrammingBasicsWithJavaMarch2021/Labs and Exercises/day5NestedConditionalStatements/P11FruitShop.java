package day5NestedConditionalStatements;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                result = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                result = quantity * 1.20;
            } else if (fruit.equals("orange")) {
                result = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                result = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                result = quantity * 2.70;
            } else if (fruit.equals("pineapple")) {
                result = quantity * 5.50;
            } else if (fruit.equals("grapes")) {
                result = quantity * 3.85;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                result = quantity * 2.70;
            } else if (fruit.equals("apple")) {
                result = quantity * 1.25;
            } else if (fruit.equals("orange")) {
                result = quantity * 0.90;
            } else if (fruit.equals("grapefruit")) {
                result = quantity * 1.60;
            } else if (fruit.equals("kiwi")) {
                result = quantity * 3.00;
            } else if (fruit.equals("pineapple")) {
                result = quantity * 5.60;
            } else if (fruit.equals("grapes")) {
                result = quantity * 4.20;
            }
        }
        if (result == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", result);
        }

    }
}
