package day2FirstStepsInCodingExercise;

import java.util.Scanner;

public class P8FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volumeInLiters = length * width * h * 0.001;
        double totalLitersNeeded = volumeInLiters - (volumeInLiters * percentage/100);

        System.out.printf("%.2f", totalLitersNeeded);
    }
}
