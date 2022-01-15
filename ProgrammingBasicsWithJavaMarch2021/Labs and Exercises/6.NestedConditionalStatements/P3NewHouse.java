package day6NestedConditionalStatements;

import java.util.Scanner;

public class P3NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int numOfFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double flowersPrice = 0;

        switch (typeOfFlowers) {
            case "Roses": {
                flowersPrice = numOfFlowers * 5.0;
                if (numOfFlowers > 80) {
                    flowersPrice *= 0.9;
                }
                break;
            }
            case "Dahlias": {
                flowersPrice = numOfFlowers * 3.8;
                if (numOfFlowers > 90) {
                    flowersPrice *= 0.85;
                }
                break;
            }
            case "Tulips": {
                flowersPrice = numOfFlowers * 2.8;
                if (numOfFlowers > 80) {
                    flowersPrice *= 0.85;
                }
                break;
            }
            case "Narcissus": {
                flowersPrice = numOfFlowers * 3.0;
                if (numOfFlowers < 120) {
                    flowersPrice *= 1.15;
                }
                break;
            }
            case "Gladiolus": {
                flowersPrice = numOfFlowers * 2.5;
                if (numOfFlowers < 80) {
                    flowersPrice *= 1.20;
                }
                break;
            }

        }
        double total = budget - flowersPrice;
        if (total >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s " +
                    "and %.2f leva left.", numOfFlowers, typeOfFlowers, total);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(total));
        }
    }
}