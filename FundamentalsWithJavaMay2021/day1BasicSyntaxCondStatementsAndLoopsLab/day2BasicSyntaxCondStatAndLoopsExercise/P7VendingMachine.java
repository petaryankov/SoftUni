package day2BasicSyntaxCondStatAndLoopsExercise;

import java.util.Scanner;

public class P7VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {

            double coins = Double.parseDouble(input);
            //works with 0.1, 0.2, 0.5, 1, and 2 coins
            if (coins != 0.1 && coins != 0.2 && coins != 0.5
                    && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f\n", coins);
                input = scanner.nextLine();
                continue;
            }
            sum += coins;
            input = scanner.nextLine();
        }
        while (true) {
            boolean isNegative = false;
            input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            if (input.equals("Nuts")) {
                sum -= 2;
                if (sum < 0) {
                    sum += 2;
                    isNegative = true;
                }

            } else if (input.equals("Water")) {
                sum -= 0.7;
                if (sum < 0) {
                    sum += 0.7;
                    isNegative = true;
                }
            } else if (input.equals("Crisps")) {
                sum -= 1.5;
                if (sum < 0) {
                    sum += 1.5;
                    isNegative = true;
                }
            } else if (input.equals("Soda")) {
                sum -= 0.8;
                if (sum < 0) {
                    sum += 0.8;
                    isNegative = true;
                }
            } else if (input.equals("Coke")) {
                sum -= 1;
                if (sum < 0) {
                    sum += 1;
                    isNegative = true;
                }
            } else {
                System.out.println("Invalid product");
                continue;
            }
            if (isNegative) {
                System.out.println("Sorry, not enough money");
            } else {
                System.out.printf("Purchased %s\n", input);
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}
