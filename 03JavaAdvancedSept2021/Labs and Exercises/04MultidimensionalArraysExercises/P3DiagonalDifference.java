package day4.MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P3DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = reedMatrix(rows, scanner);
        int fistDiagonal = getFirstSum(matrix);
        int secondDiagonal = getSecondSum(matrix);
        if (fistDiagonal > secondDiagonal) {
            System.out.println(fistDiagonal- secondDiagonal);
        } else {
            System.out.println(secondDiagonal - fistDiagonal);
        }
    }

    private static int getSecondSum(int[][] matrix) {
        int sum = 0;
        int col = 0;
        for (int row = matrix.length -1;row >= 0; row--) {
            sum += matrix[row][col];
            col++;
        }
        return sum;

    }

    private static int getFirstSum(int[][] matrix) {
        int sum = 0;
        int col = 0;
        for (int[] ints : matrix) {
            sum += ints[col];
            col++;
        }
        return sum;
    }

    private static int[][] reedMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < matrix.length; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine()
                    .split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = numbers;
        }
        return matrix;
    }
}
