package day7ForLoopLab;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Възрастта на Лили - цяло число в интервала [1...77]
        //•	Цената на пералнята - число в интервала [1.00...10 000.00]
        //•	Единична цена на играчка - цяло число в интервала [0...40]
        int liliAge = Integer.parseInt(scanner.nextLine());
        double washPrice = Double.parseDouble(scanner.nextLine());
        int presentPrice = Integer.parseInt(scanner.nextLine());

        int oddYears = 0;
        int evenYear = 0;
        double sum = 0; //2 -> 10, 4 -> 20, 6 -> 30
        for (int i = 1; i <= liliAge; i++) {

            if (i % 2 == 0) {
                evenYear++;
                sum += (10 * evenYear) - 1;
            } else {
                oddYears++;
            }

        }
        sum = sum + (oddYears * presentPrice);
        if (sum >= washPrice) {
            System.out.printf("Yes! %.2f", sum - washPrice);
        } else {
            System.out.printf("No! %.2f", washPrice - sum);
        }
    }
}
