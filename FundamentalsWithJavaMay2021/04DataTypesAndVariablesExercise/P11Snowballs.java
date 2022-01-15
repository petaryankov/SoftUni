package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSnowballsN = Integer.parseInt(scanner.nextLine());

        double maxSnowballValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowBallQuality = 0;
        for (int currentSnowball = 1; currentSnowball <= numOfSnowballsN; currentSnowball++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((double) (snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > maxSnowballValue) {
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballValue = snowballValue;
                maxSnowBallQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowBallQuality);
    }
}
