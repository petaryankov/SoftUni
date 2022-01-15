package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int targetCounter = 0;
        int currentPowerN = powerN;

        while (currentPowerN >= distanceM) {
            targetCounter++;
            currentPowerN -= distanceM;
            if ((double) powerN / 2 == currentPowerN && exhaustionFactorY > 0) {
                currentPowerN /= exhaustionFactorY;
            }
        }
        System.out.println(currentPowerN);
        System.out.println(targetCounter);
    }
}
