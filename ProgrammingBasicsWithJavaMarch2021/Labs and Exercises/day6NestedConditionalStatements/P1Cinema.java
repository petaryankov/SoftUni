package day6NestedConditionalStatements;

import java.util.Scanner;

public class P1Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int numOfRows = Integer.parseInt(scanner.nextLine());
        int numOfColumns = Integer.parseInt(scanner.nextLine());
        double result = 0;

        if (type.equals("Premiere")) {
            result = numOfColumns * numOfRows * 12.0;
        } else if (type.equals("Normal")) {
            result = numOfColumns * numOfRows * 7.5;
        } else if (type.equals("Discount")) {
            result = numOfColumns * numOfRows * 5.0;
        }
        System.out.printf("%.2f leva", result);

    }
}
