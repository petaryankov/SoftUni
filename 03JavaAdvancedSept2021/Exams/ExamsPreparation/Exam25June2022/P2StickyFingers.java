package ExamsPreparation.Exam25June2022;

import java.util.Scanner;

public class P2StickyFingers {
    static int rowPosition = -1;
    static int colPosition = -1;
    static int pocket = 0;
    static boolean isJailed = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[fieldSize][fieldSize];
        //commands
        String[] commands = scanner.nextLine().split(",");
        //reed matrix
        for (int row = 0; row < fieldSize; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < fieldSize; col++) {
                matrix[row][col] = line[col];
                if (matrix[row][col].equals("D")) {
                    rowPosition = row;
                    colPosition = col;
                }
            }
        }
        //delete D from matrix
        matrix[rowPosition][colPosition] = "+";
        for (String command : commands) {

            switch (command) {
                case "up":
                    moveUp(matrix);
                    if (isJailed) {
                        printMatrix(matrix);
                        return;
                    }
                    break;
                case "down":
                    moveDown(matrix);
                    if (isJailed) {
                        printMatrix(matrix);
                        return;
                    }
                    break;
                case "left":
                    moveLeft(matrix);
                    if (isJailed) {
                        printMatrix(matrix);
                        return;
                    }
                    break;
                case "right":
                    moveRight(matrix);
                    if (isJailed) {
                        printMatrix(matrix);
                        return;
                    }
                    break;
            }
        }
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.\n", pocket);
        matrix[rowPosition][colPosition] = "D";
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] line : matrix) {
            System.out.println(String.join(" ", line));
        }
    }

    private static void moveRight(String[][] matrix) {
        colPosition++;
        if (colPosition == matrix.length) {
            System.out.println("You cannot leave the town, there is police outside!");
            colPosition--;
        } else if (matrix[rowPosition][colPosition].equals("P")) {
            System.out.printf("You got caught with %d$, and you are going to jail.\n", pocket);
            matrix[rowPosition][colPosition] = "#";
            matrix[rowPosition][colPosition - 1] = "+";
            isJailed = true;
        } else if (matrix[rowPosition][colPosition].equals("$")) {
            int sum = rowPosition * colPosition;
            pocket += sum;
            System.out.printf("You successfully stole %d$.\n", sum);
            matrix[rowPosition][colPosition] = "+";
            matrix[rowPosition][colPosition - 1] = "+";
        }
    }

    private static void moveLeft(String[][] matrix) {
        colPosition--;
        if (colPosition < 0) {
            System.out.println("You cannot leave the town, there is police outside!");
            colPosition++;
        } else if (matrix[rowPosition][colPosition].equals("P")) {
            System.out.printf("You got caught with %d$, and you are going to jail.\n", pocket);
            matrix[rowPosition][colPosition] = "#";
            matrix[rowPosition][colPosition + 1] = "+";
            isJailed = true;
        } else if (matrix[rowPosition][colPosition].equals("$")) {
            int sum = rowPosition * colPosition;
            pocket += sum;
            System.out.printf("You successfully stole %d$.\n", sum);
            matrix[rowPosition][colPosition] = "+";
            matrix[rowPosition][colPosition + 1] = "+";
        }
    }

    private static void moveDown(String[][] matrix) {
        rowPosition++;
        if (rowPosition == matrix.length) {
            System.out.println("You cannot leave the town, there is police outside!");
            rowPosition--;
        } else if (matrix[rowPosition][colPosition].equals("P")) {
            System.out.printf("You got caught with %d$, and you are going to jail.\n", pocket);
            matrix[rowPosition][colPosition] = "#";
            matrix[rowPosition - 1][colPosition] = "+";
            isJailed = true;
        } else if (matrix[rowPosition][colPosition].equals("$")) {
            int sum = rowPosition * colPosition;
            pocket += sum;
            System.out.printf("You successfully stole %d$.\n", sum);
            matrix[rowPosition][colPosition] = "+";
            matrix[rowPosition - 1][colPosition] = "+";
        }
    }

    private static void moveUp(String[][] matrix) {
        rowPosition--;
        if (rowPosition < 0) {
            System.out.println("You cannot leave the town, there is police outside!");
            rowPosition++;
        } else if (matrix[rowPosition][colPosition].equals("P")) {
            System.out.printf("You got caught with %d$, and you are going to jail.\n", pocket);
            matrix[rowPosition][colPosition] = "#";
            matrix[rowPosition + 1][colPosition] = "+";
            isJailed = true;

        } else if (matrix[rowPosition][colPosition].equals("$")) {
            int sum = rowPosition * colPosition;
            pocket += sum;
            System.out.printf("You successfully stole %d$.\n", sum);
            matrix[rowPosition][colPosition] = "+";
            matrix[rowPosition + 1][colPosition] = "+";
        }
    }
}
