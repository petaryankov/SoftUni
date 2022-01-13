package day1BasicSyntaxCondStatementsAndLoopsLab;

import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int odd = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(odd);
            sum += odd;
            odd += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
