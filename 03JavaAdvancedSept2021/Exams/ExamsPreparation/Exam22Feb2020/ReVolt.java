package ExamsPreparation.Exam22Feb2020;

import java.util.Scanner;

public class ReVolt {
    static int row;
    static int col;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        int numOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String symbols = scanner.nextLine();
            matrix[i] = symbols.toCharArray();
            if (symbols.contains("f")) {
                row = i;
                col = symbols.indexOf('f');
            }

        }
        matrix[row][col] = '-';
        boolean isWinner = false;
        while (numOfCommands-- > 0) {
            String command = scanner.nextLine();
            if (command.equals("up")) {
                movePlayerUp(matrix);
            } else if (command.equals("down")) {
                movePlayerDown(matrix);
            } else if (command.equals("left")) {
                movePlayerLeft(matrix);
            } else if (command.equals("right")) {
                movePlayerRight(matrix);
            }
            if (matrix[row][col] == 'F') {
                isWinner = true;
                break;
            }
        }
        if (isWinner) {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }
        matrix[row][col] = 'f';
        for (char[] chars : matrix) {
            System.out.println(chars);
        }

    }

    private static void movePlayerRight(char[][] matrix) {
        col++;
        if (isOutOfBound(matrix)) {
            col = 0;
        }
        char player = matrix[row][col];
        if (player == 'B') {
            col++;
            if (isOutOfBound(matrix)) {
                col = 0;
            }
        } else if (player == 'T') {
            col--;
            if (isOutOfBound(matrix)) {
                col = matrix.length - 1;
            }
        }
    }

    private static void movePlayerLeft(char[][] matrix) {
        col = col - 1;
        if (isOutOfBound(matrix)) {
            col = matrix.length - 1;
        }
        char player = matrix[row][col];
        if (player == 'B') {
            col--;
            if (isOutOfBound(matrix)) {
                col = matrix.length - 1;
            }
        } else if (player == 'T') {
            col--;
            if (isOutOfBound(matrix)) {
                col = matrix.length - 1;
            }
        }
    }

    private static void movePlayerDown(char[][] matrix) {
        row++;
        if (isOutOfBound(matrix)) {
            row = 0;
        }
        char player = matrix[row][col];
        if (player == 'B') {
            row++;
            if (isOutOfBound(matrix)) {
                row = 0;
            }
        } else if (player == 'T') {
            row--;
            if (isOutOfBound(matrix)) {
                row = matrix.length - 1;
            }
        }

    }

    private static void movePlayerUp(char[][] matrix) {
        row--;
        if (isOutOfBound(matrix)) {
            row = matrix.length - 1;
        }
        char player = matrix[row][col];
        if (player == 'B') {
            row--;
            if (isOutOfBound(matrix)) {
                row = matrix.length - 1;
            }
        } else if (player == 'T') {
            row++;
            if (isOutOfBound(matrix)) {
                row = 0;
            }
        }
    }

    private static boolean isOutOfBound(char[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix.length;
    }
}
