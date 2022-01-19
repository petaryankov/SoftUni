package day4.MultidimensionalArraysExercises;

import java.util.Scanner;

public class P2MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = getMatrix(rows, cols);
        printMatrix(matrix);
    }

    private static String[][] getMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];
        char symbol = 'a';
        for (int row = 0; row < matrix.length; row++) {
            char symbol2 = (char) ('a' + row);
            for (int col = 0; col < matrix[row].length; col++) {
                StringBuilder sb = new StringBuilder();
                sb.append(symbol);
                sb.append(symbol2);
                sb.append(symbol);
                matrix[row][col] = sb.toString();
                symbol2++;
            }
            symbol++;
        }
        return matrix;
    }
    private static void printMatrix(String[][] matrix) {
        for (String[] ints : matrix) {
            for (String toPrint : ints) {
                System.out.print(toPrint + " ");
            }
            System.out.println();
        }
    }
}
