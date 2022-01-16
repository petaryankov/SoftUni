package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P2SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumNum = 0;
        while (number > 0) {
            sumNum += number % 10;
            number /= 10;
        }
        System.out.println(sumNum);
    }
}
