package day1BasicSyntaxCondStatementsAndLoopsLab;

import java.util.Scanner;

public class P7TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int personAge = Integer.parseInt(scanner.nextLine());

        if (dayType.equals("Weekday")) {
            if (personAge < 0 || personAge > 122) {
                System.out.println("Error!");
            } else if (personAge > 64) {
                System.out.println(12 + "$");
            } else if (personAge > 18) {
                System.out.println(18 + "$");
            } else {
                System.out.println(12 + "$");
            }
        }
        if (dayType.equals("Weekend")) {
            if (personAge < 0 || personAge > 122) {
                System.out.println("Error!");
            } else if (personAge > 64) {
                System.out.println(15 + "$");
            } else if (personAge > 18) {
                System.out.println(20 + "$");
            } else {
                System.out.println(15 + "$");
            }
        }
        if (dayType.equals("Holiday")) {
            if (personAge < 0 || personAge > 122) {
                System.out.println("Error!");
            } else if (personAge > 64) {
                System.out.println(10 + "$");
            } else if (personAge > 18) {
                System.out.println(12 + "$");
            } else {
                System.out.println(5 + "$");
            }
        }
    }
}
