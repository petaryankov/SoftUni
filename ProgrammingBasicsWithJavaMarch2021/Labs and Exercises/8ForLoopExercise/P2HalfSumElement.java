package day8ForLoopExercise;

import java.util.Scanner;

public class P2HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        sum -= maxNum;
        if (sum == maxNum) {
            System.out.printf("Yes\nSum = %d", sum);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(sum - maxNum));
        }
    }
}
