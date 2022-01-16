package day13MyMidExam;

import java.util.Scanner;

public class P1Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityHayKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityCoverKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double pigWeightKg = Double.parseDouble(scanner.nextLine()) * 1000;

        double food = quantityFoodKg;
        double hay = quantityHayKg;
        double cover = quantityCoverKg;
        for (int day = 1; day <= 30; day++) {
            food -= 300;
            if (day % 2 == 0) {
                hay -= (food * 0.05);
            }
            if (day % 3 == 0) {
                cover -= (pigWeightKg / 3);
            }
        }
        food /= 1000;
        hay /= 1000;
        cover /= 1000;
        if (food > 0 && hay > 0 && cover > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.\n", food, hay, cover);

        } else {
            System.out.println("Merry must go to the pet store!");
        }

    }
}
