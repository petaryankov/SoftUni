package day4.MultidimensionalArraysExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P6StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine()
                .split("[()]+")[1]) % 360;

        char[][] matrix = getMatrix(scanner, rotation);

        printMatrix(matrix);
        System.out.println();
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }


    private static char[][] getMatrix(Scanner scanner, int rotation) {
        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        int maxLength = 0;
        while (!input.equals("END")) {
            int currentLength = input.length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
            queue.offer(input);
            input = scanner.nextLine();
        }
        int rows = queue.size();
        char[][] matrix = new char[rows][maxLength];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String toAdd = queue.peek();
                if (toAdd.length() - 1 < col) {
                    matrix[row][col] = ' ';
                } else {
                    matrix[row][col] = toAdd.charAt(col);
                }
            }
            queue.poll();

        }
        if (rotation == 90) {
            char[][] matrix90 = new char[matrix[0].length][matrix.length];
            int row90 = 0;
            for (int col = 0; col < matrix[0].length; col++) {
                int col90 = 0;
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix90[row90][col90] = matrix[row][col];
                    col90++;
                }
                row90++;
            }
            matrix = matrix90;
        } else if (rotation == 180) {
            char[][] matrix180 = new char[matrix.length][matrix[0].length];
            int row180 = 0;
            for (int row = matrix.length - 1; row >= 0; row--) {
                int col180 = 0;
                for (int col = matrix[row].length - 1; col >= 0; col--) {
                    matrix180[row180][col180] = matrix[row][col];
                    col180++;
                }
                row180++;
            }
            matrix = matrix180;
        } else if (rotation == 270) {
            char[][] matrix270 = new char[matrix[0].length][matrix.length];
            int row270 = 0;
            for (int col = maxLength - 1; col >= 0; col--) {
                int col270 = 0;
                for (int row = 0; row < matrix.length; row++) {
                    matrix270[row270][col270] = matrix[row][col];
                    col270++;
                }
                row270++;
            }
            matrix = matrix270;
        }
        return matrix;
    }

}
