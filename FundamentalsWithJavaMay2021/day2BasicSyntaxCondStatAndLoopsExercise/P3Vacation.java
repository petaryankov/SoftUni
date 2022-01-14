package day2BasicSyntaxCondStatAndLoopsExercise;

import java.util.Scanner;

public class P3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (typeOfGroup.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45 * numOfPeople;
            } else if (day.equals("Saturday")) {
                price = 9.80 * numOfPeople;
            } else if (day.equals("Sunday")) {
                price = 10.46 * numOfPeople;
            }
            if (numOfPeople >= 30) {
                price *= 0.85;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                if (numOfPeople >= 100) {
                    price = 10.90 * (numOfPeople - 10);
                } else {
                    price = 10.90 * numOfPeople;
                }
            } else if (day.equals("Saturday")) {
                if (numOfPeople >= 100) {
                    price = 15.60 * (numOfPeople - 10);
                } else {
                    price = 15.60 * numOfPeople;
                }
            } else if (day.equals("Sunday")) {
                if (numOfPeople >= 100) {
                    price = 16.00 * (numOfPeople - 10);
                } else {
                    price = 16.00 * numOfPeople;
                }
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15.00 * numOfPeople;
            } else if (day.equals("Saturday")) {
                price = 20.00 * numOfPeople;
            } else if (day.equals("Sunday")) {
                price = 22.50 * numOfPeople;
            }
            if (numOfPeople >= 10 && numOfPeople <= 20) {
                price *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}