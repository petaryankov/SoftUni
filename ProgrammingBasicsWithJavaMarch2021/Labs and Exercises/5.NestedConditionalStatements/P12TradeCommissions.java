package day5NestedConditionalStatements;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double quantitySales = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (town.equals("Sofia") && quantitySales >= 0) {
            if (quantitySales <= 500) {
                result = quantitySales * 0.05;
            } else if (quantitySales <= 1000) {
                result = quantitySales * 0.07;
            } else if (quantitySales <= 10000) {
                result = quantitySales * 0.08;
            } else if (quantitySales > 10000) {
                result = quantitySales * 0.12;
            }


        } else if (town.equals("Varna") && quantitySales >= 0) {
            if (quantitySales <= 500) {
                result = quantitySales * 0.045;
            } else if (quantitySales <= 1000) {
                result = quantitySales * 0.075;
            } else if (quantitySales <= 10000) {
                result = quantitySales * 0.10;
            } else if (quantitySales > 10000) {
                result = quantitySales * 0.13;
            }

        } else if (town.equals("Plovdiv") && quantitySales >= 0) {
            if (quantitySales <= 500) {
                result = quantitySales * 0.055;
            } else if (quantitySales <= 1000) {
                result = quantitySales * 0.08;
            } else if (quantitySales <= 10000) {
                result = quantitySales * 0.12;
            } else if (quantitySales > 10000) {
                result = quantitySales * 0.145;
            }

        } if (result == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", result);
        }
    }
}
