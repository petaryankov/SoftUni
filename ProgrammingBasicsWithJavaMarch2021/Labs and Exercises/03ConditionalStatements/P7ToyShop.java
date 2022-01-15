package day3ConditionalStatements;

import java.util.Scanner;

public class P7ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int numOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numOfDols = Integer.parseInt(scanner.nextLine());
        int numOfBears = Integer.parseInt(scanner.nextLine());
        int numOfMinions = Integer.parseInt(scanner.nextLine());
        int numOfTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlesTotal = numOfPuzzles * 2.60;
        double dolsTotal = numOfDols * 3;
        double bearsTotal = numOfBears * 4.10;
        double minionsTotal = numOfMinions * 8.20;
        double trucksTotal = numOfTrucks * 2;

        int numOfToys = numOfPuzzles + numOfDols + numOfBears + numOfMinions + numOfTrucks;
        double toysTotal = puzzlesTotal + dolsTotal + bearsTotal + minionsTotal + trucksTotal;

        if (numOfToys >= 50) {

            toysTotal = toysTotal * 0.75;
        }
        double rent = toysTotal * 0.1;
        double totalSum = toysTotal - rent;
        double moneyLeft = totalSum - holidayPrice;

        if (moneyLeft >= 0) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));
        }


        }
    }
