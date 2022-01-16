package day6ArraysExercises;

import java.util.Scanner;

public class P1Train1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfWagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int wagon = 1; wagon <= numOfWagons; wagon++) {
            int numOfPeople = Integer.parseInt(scanner.nextLine());
            sum += numOfPeople;
            System.out.printf("%d ", numOfPeople);
        }
        System.out.printf("\n%d", sum);
    }
}
