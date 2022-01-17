package day3.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P4SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner);
        countAndPrint(matrix);

    }

    private static void countAndPrint(int[][] matrix) {
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }
        System.out.println(sum);
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
