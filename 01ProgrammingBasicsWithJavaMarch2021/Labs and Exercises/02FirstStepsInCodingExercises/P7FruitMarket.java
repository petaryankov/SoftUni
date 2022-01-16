package day2FirstStepsInCodingExercise;

import java.util.Scanner;

public class P7FruitMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberrysPrice = Double.parseDouble(scanner.nextLine());
        double bananasInKg = Double.parseDouble(scanner.nextLine());
        double orangesInKg = Double.parseDouble(scanner.nextLine());
        double raspberriesInKg = Double.parseDouble(scanner.nextLine());
        double strawberrysInKg = Double.parseDouble(scanner.nextLine());

        double raspberrysPrice = strawberrysPrice / 2;
        double orangesPrice = raspberrysPrice * 0.6;
        double bananasPrice = raspberrysPrice * 0.2;

        double strawberrysSum = strawberrysPrice * strawberrysInKg;
        double raspberrysSum = raspberrysPrice * raspberriesInKg;
        double orangesSum = orangesPrice * orangesInKg;
        double bananasSum = bananasPrice * bananasInKg;
        double total = strawberrysSum + raspberrysSum + orangesSum + bananasSum;

        System.out.printf("%.2f", total);


    }
}
