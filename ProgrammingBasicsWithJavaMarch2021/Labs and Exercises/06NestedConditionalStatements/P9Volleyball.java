package day6NestedConditionalStatements;

import java.util.Scanner;

public class P9Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String leapOrNormal = scanner.nextLine();
        int numOfYearCelebrationsP = Integer.parseInt(scanner.nextLine());
        int numOfWeekendsOffSofiaH = Integer.parseInt(scanner.nextLine());

        double playDays;
        //Влади играе 2/3 от празничните дни
        playDays =  2.0 / 3 * numOfYearCelebrationsP;
        //Влади играе 3/4 от уикендите в София + когато си путува numOfWeekendsOffSofiaH
        playDays += ((48 - numOfWeekendsOffSofiaH) * 3.0 / 4) + numOfWeekendsOffSofiaH;


        if (leapOrNormal.equals("leap")) {
            playDays *= 1.15;
        }
        System.out.printf("%.0f", Math.floor(playDays));

    }
}
