package day2FirstStepsInCodingExercise;

import java.util.Scanner;

public class P6CharityCampaign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfDays = Integer.parseInt(scanner.nextLine());
        int numOfChefs = Integer.parseInt(scanner.nextLine());
        int numOfCakes = Integer.parseInt(scanner.nextLine());
        int numOfWaffles = Integer.parseInt(scanner.nextLine());
        int numOfPancakes = Integer.parseInt(scanner.nextLine());

        double cakePrice = numOfCakes * 45;
        double wafflesPrice = numOfWaffles * 5.80;
        double pancakesPrice = numOfPancakes * 3.20;
        double sumSales = (cakePrice + wafflesPrice + pancakesPrice) * numOfDays * numOfChefs;
        double costs = sumSales / 8;
        double total = sumSales - costs;

        System.out.printf("%.2f",total);




    }
}
