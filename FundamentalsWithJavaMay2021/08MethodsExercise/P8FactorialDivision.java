package day8MethodsExercise;

import java.util.Scanner;

public class P8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        double fac1 = calculateFactorialNum(firstNum);
        double fac2 = calculateFactorialNum(secondNum);
        divideFactorials(fac1, fac2);
    }

    public static double calculateFactorialNum(int number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void divideFactorials(double a, double b) {
        double result = a / b;
        System.out.printf("%.2f", result);
    }
}
