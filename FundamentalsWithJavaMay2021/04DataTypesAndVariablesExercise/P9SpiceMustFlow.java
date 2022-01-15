package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int extracted = 0;
        int countDays = 0;
        for (int currentYield = startingYield; currentYield >= 100; currentYield -= 10) {
            extracted += currentYield - 26;
            countDays++;
        }
        System.out.println(countDays);
        if (startingYield < 100) {
            System.out.println(extracted);
        } else {
            System.out.println(extracted - 26);
        }
    }
}
