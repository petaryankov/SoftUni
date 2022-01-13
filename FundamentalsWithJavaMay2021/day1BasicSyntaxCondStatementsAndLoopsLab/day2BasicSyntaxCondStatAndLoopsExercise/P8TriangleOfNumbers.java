package day2BasicSyntaxCondStatAndLoopsExercise;

import java.util.Scanner;

public class P8TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.printf("%d ",row);
            }
            System.out.println();
        }
    }
}
