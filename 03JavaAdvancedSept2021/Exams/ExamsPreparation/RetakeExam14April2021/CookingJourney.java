package ExamsPreparation.RetakeExam14April2021;

import java.util.Scanner;

public class CookingJourney {
    static int row;
    static int col;
    static boolean isOutOfBound;
    static int dollars = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();

            if (line.contains("S")) {
                row = i;
                col = line.indexOf('S');
            }
        }

        String command = scanner.nextLine();

        while (true) {

            switch (command) {
                case "up":
                    moveUp(matrix);
                    break;
                case "down":
                    moveDown(matrix);
                    break;
                case "left":
                    moveLeft(matrix);
                    break;
                case "right":
                    moveRight(matrix);
                    break;
            }
            if (isOutOfBound) {
                break;
            }
            if (dollars >= 50) {
                matrix[row][col] = 'S';
                break;
            }
            command = scanner.nextLine();
        }

        if (isOutOfBound) {
            System.out.println("Bad news! You are out of the pastry shop.");
        } else {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }
        System.out.println("Money: " + dollars);
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }

    private static void moveRight(char[][] matrix) {
        makeDash(matrix);
        col++;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
        } else if (matrix[row][col] == 'P') {
            makeDash(matrix);
            moveToNextP(matrix);
        } else if (Character.isDigit(matrix[row][col])) {
            dollars += Character.getNumericValue(matrix[row][col]);
            makeDash(matrix);
        }
    }

    private static void moveLeft(char[][] matrix) {
        makeDash(matrix);
        col--;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
        } else if (matrix[row][col] == 'P') {
            makeDash(matrix);
            moveToNextP(matrix);
        } else if (Character.isDigit(matrix[row][col])) {
            dollars += Character.getNumericValue(matrix[row][col]);
            makeDash(matrix);
        }
    }

    private static void moveDown(char[][] matrix) {
        makeDash(matrix);
        row++;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
        } else if (matrix[row][col] == 'P') {
            makeDash(matrix);
            moveToNextP(matrix);
        } else if (Character.isDigit(matrix[row][col])) {
            dollars += Character.getNumericValue(matrix[row][col]);
            makeDash(matrix);
        }
    }

    private static void moveUp(char[][] matrix) {
        makeDash(matrix);
        row--;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
        } else if (matrix[row][col] == 'P') {
            makeDash(matrix);
            moveToNextP(matrix);
        } else if (Character.isDigit(matrix[row][col])) {
            dollars += Character.getNumericValue(matrix[row][col]);
            makeDash(matrix);
        }
    }

    private static void moveToNextP(char[][] matrix) {
        int currentRow = 0;
        for (char[] chars : matrix) {
            int currentChar = 0;
            for (char aChar : chars) {
                if (aChar == 'P') {
                    row = currentRow;
                    col = currentChar;
                }
                currentChar++;
            }
            currentRow++;
        }
        makeDash(matrix);
    }

    private static void makeDash(char[][] matrix) {
        matrix[row][col] = '-';
    }

    private static boolean isOutOfBound(char[][] matrix) {
        return row < 0 || row > matrix.length - 1 || col < 0 || col > matrix.length - 1;
    }
}
