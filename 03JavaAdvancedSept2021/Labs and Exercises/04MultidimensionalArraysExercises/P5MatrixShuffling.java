package day4.MultidimensionalArraysExercises;

import java.util.Scanner;

public class P5MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();
        String[][] matrix = reedMatrix(rows, scanner);

        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("END")) {
            if (input[0].equals("swap")) {
                if (input.length != 5) {
                    System.out.println("Invalid input!");
                    input = scanner.nextLine().split("\\s+");
                    continue;
                }
                int currentRow = Integer.parseInt(input[1]);
                int currentCol = Integer.parseInt(input[2]);
                int rowToSwap = Integer.parseInt(input[3]);
                int colToSwap = Integer.parseInt(input[4]);

                if (currentRow > rows || currentRow < 0
                        || currentCol > cols || currentCol < 0
                        || rowToSwap < 0 || rowToSwap > rows
                        || colToSwap < 0 || colToSwap > cols) {
                    System.out.println("Invalid input!");
                    input = scanner.nextLine().split("\\s+");
                    continue;
                }
                String currentNum = matrix[currentRow][currentCol];
                String numToSwap = matrix[rowToSwap][colToSwap];
                matrix[currentRow][currentCol] = numToSwap;
                matrix[rowToSwap][colToSwap] = currentNum;
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine().split("\\s+");
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    private static String[][] reedMatrix(int rows, Scanner scanner) {
        String[][] matrix = new String[rows][];
        for (int row = 0; row < matrix.length; row++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[row] = arr;
        }
        return matrix;
    }
}
