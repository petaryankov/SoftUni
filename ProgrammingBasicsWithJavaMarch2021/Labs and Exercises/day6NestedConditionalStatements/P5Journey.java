package day6NestedConditionalStatements;

import java.util.Scanner;

public class P5Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String campingOrHotel = "";
        String somewhere = "";

        if (budget <= 100) {   // При 100лв. или по-малко – някъде в България
            somewhere = "Bulgaria";
            if (season.equals("summer")) {
                campingOrHotel = "Camp";
                budget *= 0.30; // Лято – 30% от бюджета
            } else if (season.equals("winter")) {
                campingOrHotel = "Hotel";
                budget *= 0.70; //	Зима – 70% от бюджета
            }

        } else if (budget <= 1000) { //	При 1000лв. или по малко – някъде на Балканите
            somewhere = "Balkans";
            if (season.equals("summer")) {
                campingOrHotel = "Camp";
                budget *= 0.40; // Лято – 40% от бюджета
            } else if (season.equals("winter")) {
                campingOrHotel = "Hotel";
                budget *= 0.80; //	Зима – 80% от бюджета
            }
        } else if (budget > 1000) { //	При повече от 1000лв. – някъде из Европа
            somewhere = "Europe";
            campingOrHotel = "Hotel";
            budget *= 0.90; //независимо от сезона 90%
        }

        System.out.println("Somewhere in " + somewhere);
        System.out.printf("%s - %.2f", campingOrHotel, budget);
    }
}
