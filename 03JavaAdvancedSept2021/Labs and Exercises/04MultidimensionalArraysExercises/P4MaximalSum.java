package day4.MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P4MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = reedMatrix(rows, scanner);
        printMaxSumMatrix(matrix);

    }

    private static void printMaxSumMatrix(int[][] matrix) {
        int[][] maxSumMatrix = new int[3][3];
        int maxSum = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {

                int num1 = matrix[row][col];
                int num2 = matrix[row][col + 1];
                int num3 = matrix[row][col + 2];
                int num4 = matrix[row + 1][col];
                int num5 = matrix[row + 1][col + 1];
                int num6 = matrix[row + 1][col + 2];
                int num7 = matrix[row + 2][col];
                int num8 = matrix[row + 2][col + 1];
                int num9 = matrix[row + 2][col + 2];
                int currentSum = num1 + num2 + num3 + num4 + num5
                        + num6 + num7 + num8 + num9;
                int[][] currentMatrix = {{num1, num2, num3}, {num4, num5, num6},
                        {num7, num8, num9}};
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumMatrix = currentMatrix;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printMatrix(maxSumMatrix);

    }

    private static void printMatrix(int[][] maxSumMatrix) {
        for (int[] sumMatrix : maxSumMatrix) {
            for (int matrix : sumMatrix) {
                System.out.print(matrix + " ");
            }
            System.out.println();
        }
    }

    private static int[][] reedMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
