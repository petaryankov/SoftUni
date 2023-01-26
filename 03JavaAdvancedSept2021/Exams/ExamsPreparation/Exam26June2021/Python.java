package ExamsPreparation.Exam26June2021;

import java.util.Scanner;

public class Python {
    static int pRow = -1;
    static int pCol = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] navigation = scanner.nextLine().split(", ");

        char[][] matrix = new char[size][size];

        int pythonLength = 1;
        int food = 0;
        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            matrix[row] = line.toCharArray();
            if (line.contains("s")) {
                pRow = row;
                pCol = line.indexOf("s");
            }
            for (char symbol : matrix[row]) {
                if (symbol == 'f') {
                    food++;
                }
            }

        }

        boolean isKilled = false;
        for (String direction : navigation) {
            if (direction.equals("up")) {
                movePythonUp(matrix);

            } else if (direction.equals("down")) {
                movePythonDown(matrix);
            } else if (direction.equals("left")) {
                movePythonLeft(matrix);
            } else if (direction.equals("right")) {
                movePythonRight(matrix);
            }
            if (matrix[pRow][pCol] == 'e') {
                isKilled = true;
                break;
            } else if (matrix[pRow][pCol] == 'f') {
                pythonLength++;
                food--;
            }
        }
        String output;
        if (food == 0) {
            output = "You win! Final python length is " + pythonLength;
        } else if (isKilled) {
            output = "You lose! Killed by an enemy!";
        } else {
            output = "You lose! There is still " + food + " food to be eaten.";
        }
        System.out.println(output);
    }

    private static void movePythonRight(char[][] matrix) {
        pCol = pCol + 1;
        if (isOutOfBounds(matrix, pRow, pCol)) {
            flipPythonSide(matrix, pRow, pCol);
        }
    }

    private static void movePythonLeft(char[][] matrix) {
        pCol = pCol - 1;
        if (isOutOfBounds(matrix, pRow, pCol)) {
            flipPythonSide(matrix, pRow, pCol);
        }
    }

    private static void movePythonDown(char[][] matrix) {
        pRow = pRow + 1;
        if (isOutOfBounds(matrix, pRow, pCol)) {
            flipPythonSide(matrix, pRow, pCol);
        }
    }

    private static void movePythonUp(char[][] matrix) {
        pRow = pRow - 1;
        if (isOutOfBounds(matrix, pRow, pCol)) {
            flipPythonSide(matrix, pRow, pCol);
        }
    }

    private static void flipPythonSide(char[][] matrix, int row, int col) {
        if (row < 0) {
            pRow = matrix.length - 1;
        } else if (row == matrix.length) {
            pRow = 0;
        } else if (col < 0) {
            pCol = matrix[row].length -1;
        } else if (col == matrix[row].length) {
            pCol = 0;
        }
    }

    private static boolean isOutOfBounds(char[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }
}
