package day4ConditionalStatements;

import java.util.Scanner;

public class P8Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());

        String result = "";

        double socialScholarship = Math.floor(minWage * 0.35);
        double scholarship = Math.floor(averageScore * 25);
        //Social scholarship!
        if (income < minWage && averageScore > 4.50) {
            if (scholarship >= socialScholarship && averageScore >= 5.50) {
                result = String.format("You get a scholarship for excellent results %.0f BGN", scholarship);
            } else {
                result = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
            }
            // Scholarship
        } else if (averageScore >= 5.50) {
            if (income < minWage && socialScholarship > scholarship) {
                result = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                result = String.format("You get a scholarship for excellent results %.0f BGN", scholarship);
            }
            //You cannot get a scholarship
        } else {
            result = "You cannot get a scholarship!";
        }
        System.out.println(result);

    }
}
