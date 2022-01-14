package day2FirstStepsInCodingExercise;

import java.util.Scanner;

public class P3DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int depositTerm = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());
        annualInterestRate = annualInterestRate / 100 * deposit * depositTerm / 12;
        double sum = deposit + annualInterestRate;
        System.out.println(sum);
    }
}
