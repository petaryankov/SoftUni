package day2BasicSyntaxCondStatAndLoopsExercise;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetSum = 0;
        double mouseSum = 0;
        double keyboardSum = 0;
        int keyboardCounter = 0;
        double displaySum = 0;
        for (int counter = 1; counter <= lostGames; counter++) {
            if (counter % 2 == 0) {
                headsetSum += headsetPrice;
            }
            if (counter % 3 == 0) {
                mouseSum += mousePrice;
            }
            if (counter % 6 == 0) {
                keyboardSum += keyboardPrice;
                keyboardCounter++;
            }
            if (keyboardCounter == 2) {
                displaySum += displayPrice;
                keyboardCounter = 0;
            }
        }
        double sum = headsetSum + mouseSum + keyboardSum + displaySum;
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
