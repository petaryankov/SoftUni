package day1FirstStepsInCodingLab;

import java.util.Scanner;

public class P9YardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scanner.nextLine());

        double pricePerSqMeter = squareMeters * 7.61;
        double discount = pricePerSqMeter * 0.18;
        double finalPrice = pricePerSqMeter - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
        System.out.printf("The final price is: %d lv.",finalPrice);
    }
}
