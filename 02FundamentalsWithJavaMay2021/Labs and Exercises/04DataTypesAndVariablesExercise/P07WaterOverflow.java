package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPour = Integer.parseInt(scanner.nextLine());
        int sumOfLiters = 0;
        for (int pour = 1; pour <= numOfPour; pour++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sumOfLiters += liters;
            if (sumOfLiters > 255) {
                sumOfLiters -= liters;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sumOfLiters);
    }
}
