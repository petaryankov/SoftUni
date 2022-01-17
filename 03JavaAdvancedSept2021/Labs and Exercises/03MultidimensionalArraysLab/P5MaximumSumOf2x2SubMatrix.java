package day3.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P5MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner);
        findAndPrint(matrix);

        System.out.println();
        
    }

    private static void findAndPrint(int[][] matrix) {

        int maxSum = 0;
        int bestMatrixFirstLeft = 0;
        int bestMatrixFirstRight = 0;
        int bestMatrixSecondLeft = 0;
        int bestMatrixSecondRight = 0;
        for (int row = 0; row < matrix.length -1; row++) {
            for (int col = 0; col < matrix[row].length -1; col++) {
                int firstLeft = matrix[row][col];
                int firstRight = matrix[row][col + 1];
                int secondLeft = matrix[row + 1][col];
                int secondRight = matrix[row + 1][col + 1];
                int currentSum = firstLeft + firstRight + secondLeft + secondRight;
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestMatrixFirstLeft = firstLeft;
                    bestMatrixFirstRight = firstRight;
                    bestMatrixSecondLeft = secondLeft;
                    bestMatrixSecondRight = secondRight;
                }

            }
        }
        System.out.printf("%d %d\n", bestMatrixFirstLeft, bestMatrixFirstRight);
        System.out.printf("%d %d\n", bestMatrixSecondLeft, bestMatrixSecondRight);
        System.out.println(maxSum);
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] rowsAndCols = Arrays.stream(scanner.nextLine()
                .split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine()
                    .split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = numbers;
        }
        return matrix;
    }
}
