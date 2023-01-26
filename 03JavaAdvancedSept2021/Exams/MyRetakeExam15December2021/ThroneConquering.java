package MyRetakeExam15December2021;

import java.util.Scanner;

public class ThroneConquering {
    static int row;
    static int col;
    static int staticParisEnergy;
    static boolean isParisDied;
    static boolean isHelenaFound;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        staticParisEnergy = Integer.parseInt(scanner.nextLine());

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            String symbols = scanner.nextLine();
            matrix[i] = symbols.toCharArray();

            if (symbols.contains("P")) {
                row = i;
                col = symbols.indexOf('P');
            }
        }
        matrix[row][col] = '-';

        while (!isHelen(matrix)) {
            String[] commands = scanner.nextLine().split(" ");
            String move = commands[0];
            int sRow = Integer.parseInt(commands[1]);
            int sCol = Integer.parseInt(commands[2]);
            switch (move) {
                case "up":
                    moveUp(matrix, sRow, sCol);
                    break;
                case "down":
                    moveDown(matrix, sRow, sCol);
                    break;
                case "left":
                    moveLeft(matrix, sRow, sCol);
                    break;
                case "right":
                    moveRight(matrix, sRow, sCol);
                    break;
            }
            if (isHelenaFound) {
                System.out.printf("Paris has successfully abducted Helen! Energy left: %d\n", staticParisEnergy);
                break;
            } else if (isParisDied) {
                makeX(matrix);
                System.out.printf("Paris died at %d;%d.\n", row, col);
                break;
            }
        }

        for (char[] chars : matrix) {
            System.out.println(chars);
        }

    }

    private static void moveRight(char[][] matrix, int sRow, int sCol) {
        makeSpartan(matrix, sRow, sCol);
        col++;
        staticParisEnergy--;
        if (isOutOfBound(matrix)) {
            col--;
            if (isParisDie()) {
                isParisDied = true;
                makeX(matrix);
                return;
            }
        } else if (isHelen(matrix)) {
            makeDash(matrix);
            isHelenaFound = true;
        } else if (isParisDie()) {
            isParisDied = true;
        }
        if (isSpartan(matrix)) {
            staticParisEnergy -= 2;
            if (isParisDie()) {
                isParisDied = true;
                makeX(matrix);
            } else {
                makeDash(matrix);
            }
        }
    }

    private static void moveLeft(char[][] matrix, int sRow, int sCol) {
        makeSpartan(matrix, sRow, sCol);
        col--;
        staticParisEnergy--;
        if (isOutOfBound(matrix)) {
            col++;
            if (isParisDie()) {
                makeX(matrix);
                isParisDied = true;
                return;
            }
        } else if (isHelen(matrix)) {
            makeDash(matrix);
            isHelenaFound = true;
        } else if (isParisDie()) {
            isParisDied = true;
        }
        if (isSpartan(matrix)) {
            staticParisEnergy -= 2;
            if (isParisDie()) {
                isParisDied = true;
                makeX(matrix);
            } else {
                makeDash(matrix);
            }
        }
    }

    private static void moveDown(char[][] matrix, int sRow, int sCol) {
        makeSpartan(matrix, sRow, sCol);
        row++;
        staticParisEnergy--;
        if (isOutOfBound(matrix)) {
            row--;
            if (isParisDie()) {
                makeX(matrix);
                isParisDied = true;
                return;
            }
        } else if (isHelen(matrix)) {
            makeDash(matrix);
            isHelenaFound = true;
        } else if (isParisDie()) {
            isParisDied = true;
        }
        if (isSpartan(matrix)) {
            staticParisEnergy -= 2;
            if (isParisDie()) {
                isParisDied = true;
                makeX(matrix);
            } else {
                makeDash(matrix);
            }
        }
    }

    private static void moveUp(char[][] matrix, int sRow, int sCol) {
        makeSpartan(matrix, sRow, sCol);
        row--;
        staticParisEnergy--;
        if (isOutOfBound(matrix)) {
            row++;
            if (isParisDie()) {
                isParisDied = true;
                makeX(matrix);
                return;
            }
        } else if (isHelen(matrix)) {
            makeDash(matrix);
            isHelenaFound = true;
        } else if (isParisDie()) {
            isParisDied = true;
        }
        if (isSpartan(matrix)) {
            staticParisEnergy -= 2;
            if (isParisDie()) {
                isParisDied = true;
                makeX(matrix);
            } else {
                makeDash(matrix);
            }
        }
    }

    private static void makeDash(char[][] matrix) {
        matrix[row][col] = '-';
    }

    private static boolean isHelen(char[][] matrix) {
        return matrix[row][col] == 'H';
    }

    private static void makeX(char[][] matrix) {
        matrix[row][col] = 'X';
    }

    private static boolean isSpartan(char[][] matrix) {
        return matrix[row][col] == 'S';
    }

    private static boolean isOutOfBound(char[][] matrix) {
        return row < 0 || row > matrix.length - 1
                || col < 0 || col > matrix[row].length - 1;
    }

    private static void makeSpartan(char[][] matrix, int sRow, int sCol) {
        matrix[sRow][sCol] = 'S';
    }

    private static boolean isParisDie() {
        return staticParisEnergy <= 0;
    }
}
