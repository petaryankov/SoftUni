package day7ForLoopLab;

import java.util.Scanner;

public class P8NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers < minNum ) {
                minNum = numbers;
            }
            if (numbers > maxNum) {
                maxNum = numbers;
            }
        }
        System.out.printf("Max number: %d\nMin number: %d", maxNum, minNum);
    }
}
