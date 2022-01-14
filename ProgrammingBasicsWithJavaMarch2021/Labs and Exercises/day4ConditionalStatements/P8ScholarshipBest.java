package day4ConditionalStatements;

import java.util.Scanner;

public class P8ScholarshipBest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minimumWage = Double.parseDouble(scanner.nextLine());

        double socialScholarship = Math.floor(minimumWage * 0.35);
        double scholarship = Math.floor(averageGrade * 25);
        // scholarship + if socialScholarship > scholarship result = socialScholarship
        if (averageGrade >= 5.50) {
            if (socialScholarship > scholarship && income < minimumWage) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarship);
            }
            // Social scholarship
        } else if (income < minimumWage && averageGrade > 4.50) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);

        } else {
            System.out.println("You cannot get a scholarship!");

        }
    }
}
