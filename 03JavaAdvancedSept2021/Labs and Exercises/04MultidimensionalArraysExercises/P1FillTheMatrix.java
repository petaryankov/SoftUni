package day4.MultidimensionalArraysExercises;

import java.util.Scanner;

public class P1FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        String matrixType = input[1];
        if (matrixType.equals("A")) {
            int[][] matrix = getMatrixA(rows);
            printMatrix(matrix);
        } else if (matrixType.equals("B")) {
            int[][] matrix = getMatrixB(rows);
            printMatrix(matrix);
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int toPrint : ints) {
                System.out.print(toPrint + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrixA(int rows) {
        int[][] matrix = new int[rows][rows];
        int number = 1;
        for (int col = 0; col < rows; col++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][col] = number;
                number++;
            }
        }
        return matrix;

    }

    private static int[][] getMatrixB(int rows) {
        int[][] matrix = new int[rows][rows];
        int number = 1;
        for (int col = 0; col < rows; col++) {
            int oddRow = matrix.length - 1;
            for (int row = 0; row < rows; row++) {
                if (col % 2 == 0) {
                    matrix[row][col] = number;
                } else {
                    matrix[oddRow][col] = number;
                    oddRow--;
                }
                number++;
            }
        }
        return matrix;
    }
}
