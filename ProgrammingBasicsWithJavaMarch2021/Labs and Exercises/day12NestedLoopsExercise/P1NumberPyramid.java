package day12NestedLoopsExercise;

import java.util.Scanner;

public class P1NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 0;
        boolean isBigger = false;
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                current++;
                if (current > n) {
                    isBigger = true;
                    break;
                }
                System.out.printf("%d ", current);
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
