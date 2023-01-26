package MyFirstExam23October2021;

import java.util.Scanner;

public class MouseAndCheese {
    static int row;
    static int col;
    static int cheese = 0;
    static boolean isOutOfBound = false;

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
        int startRow = row;
        int startCol = col;
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.equals("up")) {
                movePlayerUp(matrix);
                if (isOutOfBound(matrix)) {
                    isOutOfBound = true;
                    break;
                }

            } else if (command.equals("down")) {
                movePlayerDown(matrix);
                if (isOutOfBound(matrix)) {
                    isOutOfBound = true;
                    break;
                }
            } else if (command.equals("left")) {
                movePlayerLeft(matrix);
                if (isOutOfBound(matrix)) {
                    isOutOfBound = true;
                    break;
                }
            } else if (command.equals("right")) {
                movePlayerRight(matrix);
                if (isOutOfBound(matrix)) {
                    isOutOfBound = true;
                    break;
                }
            }

            command = scanner.nextLine();
        }
        matrix[startRow][startCol] = '-';
        if (isOutOfBound) {
            System.out.println("Where is the mouse?");
        } else {
            char mouse = 'M';
            matrix[row][col] = mouse;
        }
        if (cheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!\n", cheese);
        } else {
            int neededCheese = 5 - cheese;
            System.out.printf("The mouse couldn't eat the cheeses" +
                    ", she needed %d cheeses more.\n", neededCheese);
        }
        for (char[] chars : matrix) {
            System.out.println(chars);
        }

    }

    private static void movePlayerRight(char[][] matrix) {
        col++;
        if (isOutOfBound(matrix)) {
            matrix[row][col - 1] = '-';
            return;
        }
        char mouse = matrix[row][col];
        if (matrix[row][col] == 'c') {
            cheese++;
            matrix[row][col] = '-';
        } else if (mouse == 'B') {
            matrix[row][col] = '-';
            col++;

            if (matrix[row][col] == 'c') {
                cheese++;
                matrix[row][col] = '-';
            }

        }
    }

    private static void movePlayerLeft(char[][] matrix) {
        col = col - 1;
        if (isOutOfBound(matrix)) {
            matrix[row][col + 1] = '-';
            return;
        }
        char mouse = matrix[row][col];
        if (matrix[row][col] == 'c') {
            cheese++;
            matrix[row][col] = '-';
        } else if (mouse == 'B') {
            matrix[row][col] = '-';
            col--;

            if (matrix[row][col] == 'c') {
                cheese++;
                matrix[row][col] = '-';
            }

        }
    }

    private static void movePlayerDown(char[][] matrix) {
        row++;
        if (isOutOfBound(matrix)) {
            matrix[row - 1][col] = '-';
            return;
        }
        char mouse = matrix[row][col];
        if (matrix[row][col] == 'c') {
            cheese++;
            matrix[row][col] = '-';
        } else if (mouse == 'B') {
            matrix[row][col] = '-';
            row++;

            if (matrix[row][col] == 'c') {
                cheese++;
                matrix[row][col] = '-';
            }

        }
    }

    private static void movePlayerUp(char[][] matrix) {
        row--;
        if (isOutOfBound(matrix)) {
            matrix[row + 1][col] = '-';
            return;
        }

        char mouse = matrix[row][col];
        if (matrix[row][col] == 'c') {
            cheese++;
            matrix[row][col] = '-';
        } else if (mouse == 'B') {
            matrix[row][col] = '-';
            row--;

            if (matrix[row][col] == 'c') {
                cheese++;
                matrix[row][col] = '-';
            }

        }
    }

    private static boolean isOutOfBound(char[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix.length;
    }
}
