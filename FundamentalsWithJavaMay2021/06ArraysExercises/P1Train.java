package day6ArraysExercises;

import java.util.Scanner;

public class P1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfWagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[numOfWagons];

        int sum = 0;
        for (int wagon = 0; wagon < numOfWagons; wagon++) {
            train[wagon] = Integer.parseInt(scanner.nextLine());
            sum += train[wagon];
        System.out.printf("%d ", train[wagon]);
        }
        System.out.println("\n" + sum);
    }
}
