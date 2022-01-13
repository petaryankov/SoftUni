package day2BasicSyntaxCondStatAndLoopsExercise;

import java.util.Scanner;

public class P6StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int startNum = n;
        int sumFact = 0;
        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = digit; i >= 1; i--) {
                fact *= i;
            }
            sumFact += fact;
            n /= 10;
        }
        if (sumFact == startNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
