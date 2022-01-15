package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P9SpiceMustFlowWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int currentYield = startingYield;
        int extracted = 0;
        int countDays = 0;
        while (currentYield >= 0) {
            if (startingYield < 26) {
                break;
            } else if (currentYield < 100) {
               if (startingYield < 100) {
                   extracted = 0;
                   break;
               }
                extracted -= 26;
                break;
            }
            countDays++;
            extracted += currentYield - 26;
            currentYield -= 10;
        }
        System.out.println(countDays);
        System.out.println(extracted);
    }
}
