package ExamsPreparation.Exam20February2021;

import java.util.Scanner;

public class Bomb {
    static int row = 0;
    static int col = 0;
    static boolean isEnd;
    static boolean isAllBombs;
    static int allBombs = 0;
    static int foundBombs = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        String[] commands = scanner.nextLine().split(",");

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            char[] toTrim = line.toCharArray();
            StringBuilder toMatrix = new StringBuilder();
            for (char symbol : toTrim) {
                if (symbol != ' ') {
                    toMatrix.append(symbol);
                }
            }

            matrix[i] = toMatrix.toString().toCharArray();
            if (toMatrix.toString().contains("s")) {
                row = i;
                col = toMatrix.toString().indexOf('s');
            }
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == 'B') {
                    allBombs++;
                }
            }
        }
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
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
            if (foundBombs == allBombs) {
                isAllBombs = true;
                break;
            } else if (isEnd) {
                break;
            }
        }
        if (isAllBombs) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (isEnd) {
            System.out.printf("END! %d bombs left on the field", allBombs - foundBombs);
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)"
                    , allBombs - foundBombs, row, col);
        }
    }

    private static void moveRight(char[][] matrix) {
        makePlus(matrix);
        col++;
        if (isOutOfBound(matrix)) {
            col = matrix.length - 1;
        }
        if (matrix[row][col] == 'e') {
            isEnd = true;
            return;
        }
        if (isBomb(matrix)) {
            System.out.println("You found a bomb!");
            foundBombs++;
            makePlus(matrix);
        }
    }

    private static void moveLeft(char[][] matrix) {
        makePlus(matrix);
        col--;
        if (isOutOfBound(matrix)) {
            col = 0;
        }
        if (matrix[row][col] == 'e') {
            isEnd = true;
            return;
        }
        if (isBomb(matrix)) {
            System.out.println("You found a bomb!");
            foundBombs++;
            makePlus(matrix);
        }
    }

    private static void moveDown(char[][] matrix) {
        makePlus(matrix);
        row++;
        if (isOutOfBound(matrix)) {
            row = matrix.length - 1;
        }
        if (matrix[row][col] == 'e') {
            isEnd = true;
            return;
        }
        if (isBomb(matrix)) {
            System.out.println("You found a bomb!");
            foundBombs++;
            makePlus(matrix);
        }
    }

    private static void moveUp(char[][] matrix) {
        makePlus(matrix);
        row--;
        if (isOutOfBound(matrix)) {
            row = 0;
        }
        if (matrix[row][col] == 'e') {
            isEnd = true;
            return;
        }
        if (isBomb(matrix)) {
            System.out.println("You found a bomb!");
            foundBombs++;
            makePlus(matrix);
        }

    }

    private static boolean isBomb(char[][] matrix) {
        if(matrix[row][col] == 'B') {
            return true;
        }
        return matrix[row][col] == 'B';
    }

    private static boolean isOutOfBound(char[][] matrix) {
        return row < 0 || row > matrix.length - 1 || col < 0 || col > matrix.length - 1;
    }

    private static void makePlus(char[][] matrix) {
        matrix[row][col] = '+';
    }
}
