package day10WhileLoopExercise;

import java.util.Scanner;

public class P3Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int fail = 0;
        boolean isFail = false;
        while (currentMoney < holidayPrice) {
            days++;
            String spendOrSave = scanner.nextLine();
            double safeOrSpend = Double.parseDouble(scanner.nextLine());
            if (spendOrSave.equals("spend")) {
                fail++;
                currentMoney -= safeOrSpend;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
                if (fail == 5) {
                    isFail = true;
                    break;
                }
            } else {
                fail = 0;
                currentMoney += safeOrSpend;
            }
        }
        if (isFail) {
            System.out.println("You can't save the money.");
            System.out.println(days);

        } else {
            System.out.printf("You saved the money for %d days.", days);
        }


    }
}
