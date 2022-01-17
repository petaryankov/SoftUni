package day3.MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P2PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner);
        int number = scanner.nextInt();
        printNumber(matrix, number);

    }

    private static void printNumber(int[][] matrix, int number) {
        boolean flag = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == number) {
                    System.out.println(row + " " + column);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("not found");
        }
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = numbers[0];
        int cols = numbers[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {

            matrix[row] = Arrays.stream(scanner.nextLine()
                    .split(" ")).mapToInt(Integer::parseInt).toArray();

        }
        return matrix;
    }
}