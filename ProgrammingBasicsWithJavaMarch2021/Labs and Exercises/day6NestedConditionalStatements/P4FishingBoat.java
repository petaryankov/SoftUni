package day6NestedConditionalStatements;

import java.util.Scanner;

public class P4FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        int groupBudget = Integer.parseInt(scanner.nextLine()); //[1…8000]
        String season = scanner.nextLine(); // "Spring", "Summer", "Autumn", "Winter"
        int numOfFisherman = Integer.parseInt(scanner.nextLine()); //[4…18]

        double boatPrice = 0;
        // seasons condition
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                // discounts
                if (numOfFisherman <= 6) {
                    boatPrice *= 0.9; // 10% discount
                } else if (numOfFisherman <= 11) {
                    boatPrice *= 0.85; // 15% discount
                } else if (numOfFisherman >= 12) {
                    boatPrice *= 0.75; // 25% discount
                }
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                // discounts
                if (numOfFisherman <= 6) {
                    boatPrice *= 0.9; // 10% discount
                } else if (numOfFisherman <= 11) {
                    boatPrice *= 0.85; // 15% discount
                } else if (numOfFisherman >= 12) {
                    boatPrice *= 0.75; // 25% discount
                }
                break;
            case "Winter":
                boatPrice = 2600;
                // discounts
                if (numOfFisherman <= 6) {
                    boatPrice *= 0.9; // 10% discount
                } else if (numOfFisherman <= 11) {
                    boatPrice *= 0.85; // 15% discount
                } else if (numOfFisherman >= 12) {
                    boatPrice *= 0.75; // 25% discount
                }
                break;

        }
        if (numOfFisherman % 2 == 0 && !season.equals("Autumn")) { // extra discount 5%
            boatPrice *= 0.95;
        }
        double total = groupBudget - boatPrice;
        // output prints
        if (total >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(total));
        }

    }
}
