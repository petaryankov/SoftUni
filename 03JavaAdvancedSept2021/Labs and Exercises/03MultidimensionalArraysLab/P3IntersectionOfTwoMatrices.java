package day3.MultidimensionalArraysLab;

import java.util.Scanner;

public class P3IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrix1 = getMatrix(scanner, rows, cols);
        char[][] matrix2 = getMatrix(scanner, rows, cols);
        compareAndPrint(matrix1, matrix2);

    }

    private static void compareAndPrint(char[][] matrix1, char[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                char symbol1 = matrix1[row][col];
                char symbol2 = matrix2[row][col];
                if (symbol1 == symbol2) {
                    System.out.print(symbol1 + " ");
                } else {
                    System.out.print('*' + " ");
                }
            }
            System.out.println();
        }
    }

    private static char[][] getMatrix(Scanner scanner, int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String input = scanner.nextLine();
            String[] toChar = input.split("\\s+");
            for (int i = 0; i < cols; i++) {
                char symbol = toChar[i].charAt(0);
                matrix[row][i] = symbol;

            }
        }
        return matrix;
    }

}
