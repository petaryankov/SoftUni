package ExamsPreparation.ExamRetakeExam18August2021;

import java.util.Scanner;

public class FormulaOne {
    static int row;
    static int col;
    static boolean isFinal;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int numOfCommands = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];


        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();

            if (line.contains("P")) {
                row = i;
                col = line.indexOf('P');
            }
        }
        while (numOfCommands-- > 0) {
            String command = scanner.nextLine();

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
            if (isFinal) {
                matrix[row][col] = 'P';
                break;
            } else {
                matrix[row][col] = 'P';
            }
        }
        if (isFinal) {
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }
        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }

    private static void moveRight(char[][] matrix) {
        makeDot(matrix);
        col++;
        if (isOutOfBound(matrix)) {
            col = 0;
        }
        if (isFinal(matrix)) {
            isFinal = true;
        } else if (isBonus(matrix)) {
            col++;
            if (isOutOfBound(matrix)) {
                col = 0;
            }
            if (isFinal(matrix)) {
                isFinal = true;
            }
        } else if (isTrap(matrix)) {
            col--;
            if (isOutOfBound(matrix)) {
                col = matrix.length - 1;
            }
        }
    }

    private static void moveLeft(char[][] matrix) {
        makeDot(matrix);
        col--;
        if (isOutOfBound(matrix)) {
            col = matrix.length - 1;
        }
        if (isFinal(matrix)) {
            isFinal = true;
        } else if (isBonus(matrix)) {
            col--;
            if (isOutOfBound(matrix)) {
                col = matrix.length - 1;
            }
            if (isFinal(matrix)) {
                isFinal = true;
            }
        } else if (isTrap(matrix)) {
            col++;
            if (isOutOfBound(matrix)) {
                col = 0;
            }
        }

    }

    private static void moveDown(char[][] matrix) {
        makeDot(matrix);
        row++;
        if (isOutOfBound(matrix)) {
            row = 0;
        }
        if (isFinal(matrix)) {
            isFinal = true;
        } else if (isBonus(matrix)) {
            row++;
            if (isOutOfBound(matrix)) {
                row = 0;
            }
            if (isFinal(matrix)) {
                isFinal = true;
            }

        } else if (isTrap(matrix)) {
            row--;
            if (isOutOfBound(matrix)) {
                row = matrix.length - 1;
            }
        }
    }

    private static void moveUp(char[][] matrix) {
        makeDot(matrix);
        row--;
        if (isOutOfBound(matrix)) {
            row = matrix.length - 1;
        }
        if (isFinal(matrix)) {
            isFinal = true;
        } else if (isBonus(matrix)) {
            row--;
            if (isOutOfBound(matrix)) {
                row = matrix.length - 1;
            }
            if (isFinal(matrix)) {
                isFinal = true;
            }
        } else if (isTrap(matrix)) {
            row++;
            if (isOutOfBound(matrix)) {
                row = 0;
            }
        }

    }

    private static boolean isFinal(char[][] matrix) {
        return matrix[row][col] == 'F';
    }

    private static boolean isTrap(char[][] matrix) {
        return matrix[row][col] == 'T';
    }

    private static boolean isBonus(char[][] matrix) {
        return matrix[row][col] == 'B';
    }

    private static boolean isOutOfBound(char[][] matrix) {
        return row < 0 || row > matrix.length - 1 || col < 0 || col > matrix.length - 1;
    }

    private static void makeDot(char[][] matrix) {
        matrix[row][col] = '.';
    }
}
