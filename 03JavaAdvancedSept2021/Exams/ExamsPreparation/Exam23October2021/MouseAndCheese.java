package ExamsPreparation.Exam23October2021.P1;

import java.util.Scanner;

public class MouseAndCheese {
    static int row;
    static int col;
    static int cheese;
    static boolean isOutOfBound;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            String symbols = scanner.nextLine();
            matrix[i] = symbols.toCharArray();

            if (symbols.contains("M")) {
                row = i;
                col = symbols.indexOf('M');
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
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
            command = scanner.nextLine();
        }

        if (isOutOfBound) {
            System.out.println("Where is the mouse?");
        } else {
            makeMouseSymbol(matrix);
        }

        if (cheese < 5) {
            int neededCheese = 5 - cheese;
            System.out.printf("The mouse couldn't eat the cheeses" +
                    ", she needed %d cheeses more.\n", neededCheese);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!\n", cheese);
        }

        printMatrix(matrix);

    }


    private static void moveRight(char[][] matrix) {
        makeDashSymbol(matrix);
        col++;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
            return;
        }

        if (matrix[row][col] == 'c') {
            cheese++;
        }

        if (matrix[row][col] == 'B') {
            makeDashSymbol(matrix);
            col++;
            if (matrix[row][col] == 'c') {
                cheese++;
            }
        }

    }


    private static void moveLeft(char[][] matrix) {
        makeDashSymbol(matrix);
        col--;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
            return;
        }

        if (matrix[row][col] == 'c') {
            cheese++;
        }

        if (matrix[row][col] == 'B') {
            makeDashSymbol(matrix);
            col--;

            if (matrix[row][col] == 'c') {
                cheese++;
            }

        }

    }


    private static void moveDown(char[][] matrix) {
        makeDashSymbol(matrix);
        row++;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
            return;
        }

        if (matrix[row][col] == 'c') {
            cheese++;
        }

        if (matrix[row][col] == 'B') {
            makeDashSymbol(matrix);
            row++;

            if (matrix[row][col] == 'c') {
                cheese++;
            }
        }

    }

    private static void moveUp(char[][] matrix) {
        makeDashSymbol(matrix);
        row--;
        if (isOutOfBound(matrix)) {
            isOutOfBound = true;
            return;
        }
        if (matrix[row][col] == 'c') {
            cheese++;
        }

        if (matrix[row][col] == 'B') {
            makeDashSymbol(matrix);
            row--;
            if (matrix[row][col] == 'c') {
                cheese++;
            }
        }

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }

    private static void makeMouseSymbol(char[][] matrix) {
        matrix[row][col] = 'M';
    }

    private static void makeDashSymbol(char[][] matrix) {
        matrix[row][col] = '-';
    }

    private static boolean isOutOfBound(char[][] matrix) {
        return row < 0 || row >= matrix.length
                || col < 0 || col >= matrix[row].length;
    }
}
