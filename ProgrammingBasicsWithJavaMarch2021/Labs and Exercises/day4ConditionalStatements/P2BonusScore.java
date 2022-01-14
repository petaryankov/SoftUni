package day4ConditionalStatements;

import java.util.Scanner;

public class P2BonusScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints;

        if (number <= 100) {
            bonusPoints = 5;
        } else if (number > 1000) {
            bonusPoints = number * 0.1;
        } else {
            bonusPoints = number * 0.2;
        }
        if (number % 2 == 0) {
            bonusPoints ++;
        } else if (number % 10 == 5) {
            bonusPoints += 2;
        }
        System.out.println(bonusPoints);
        System.out.println(number + bonusPoints);
    }
}
