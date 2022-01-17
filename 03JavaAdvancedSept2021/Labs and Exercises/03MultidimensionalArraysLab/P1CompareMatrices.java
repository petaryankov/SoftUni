package day3.MultidimensionalArraysLab;

import java.util.Scanner;

public class P1CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix1 = getMatrix(scanner);
        int[][] matrix2 = getMatrix(scanner);

        boolean checker = checkMatrix(matrix1, matrix2);

        if (checker) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static boolean checkMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int row = 0; row < matrix1.length; row++) {
            if (matrix1[row].length != matrix2[row].length) {
                return false;
            }
            for (int column = 0; column < matrix1[row].length; column++) {
                if (matrix1[row][column] != matrix2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] getMatrix(Scanner scanner) {
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < cols; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
