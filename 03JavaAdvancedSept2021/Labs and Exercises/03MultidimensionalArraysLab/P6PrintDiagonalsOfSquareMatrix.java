package day3.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P6PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner);
        printDiagonals(matrix);


    }

    private static void printDiagonals(int[][] matrix) {

        int[] firstDiagonal = new int[matrix.length];
        int[] secondDiagonal = new int[matrix.length];
        int secondNumRow = matrix.length - 1;
        for (int row = 0; row < matrix.length; row++) {
            int firstCol = row;
            int firstNumber = matrix[row][firstCol];
            firstDiagonal[row] = firstNumber;
            int secondNumber = matrix[secondNumRow][firstCol];
            secondDiagonal[row] = secondNumber;
            secondNumRow--;
        }
        System.out.println(Arrays.toString(firstDiagonal).replaceAll("[\\[\\],]", ""));
        System.out.println(Arrays.toString(secondDiagonal).replaceAll("[\\[\\],]", ""));
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] rowsAndCols = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine()
                    .split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = numbers;
        }
        return matrix;
    }
}
