package day4ConditionalStatements;

import java.util.Scanner;

public class P6GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double extrasCostumePrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        if (extras > 150) {
            extrasCostumePrice *= 0.9;
        }
        double expencese = (extras * extrasCostumePrice) + decor;

        if (budget >= expencese) {
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", budget - expencese);
        } else {
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.", expencese - budget);
        }
    }
}
