package Exams.MyExam;

import java.util.Scanner;

public class P2BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първи ред – джобните на Тереза на ден – реално число в интервала [1.00 ...100.00]
        //•	Втори ред – парите, които тя печели на ден от продажби – реално число в интервала [1.00...1000.00]
        //•	Трети ред – разходите на Тереза за целия период – реално число в интервала [1.00...1000.00]
        //•	Четвърти ред – цената на подаръка – реално число в интервала [1.00...10000.00]
        double currentAmount = Double.parseDouble(scanner.nextLine());
        double income = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double savings = 5 * currentAmount;
        double earnedMoney = 5 * income;
        double allSavings = savings + earnedMoney - expenses;

        if (giftPrice > allSavings) {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - allSavings);
        } else {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",allSavings);
        }
    }
}
