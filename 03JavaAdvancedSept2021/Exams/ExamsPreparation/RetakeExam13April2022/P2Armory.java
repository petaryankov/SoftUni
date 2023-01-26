package ExamsPreparation.RetakeExam13April2022;

import java.util.Scanner;

public class P2Armory {
    static int currentRow = -1;
    static int currentCol = -1;
    static int coins = 0;
    static boolean isFlag = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        for (int row = 0; row < matrix.length; row++) {
            String[] line = scanner.nextLine().split("");
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = line[col];
                if (matrix[row][col].equals("A")) {
                    currentRow = row;
                    currentCol = col;
                }
            }
        }
        matrix[currentRow][currentCol] = "-";
        while (!isFlag) {
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
        }
        if (coins >= 65) {
            System.out.println("Very nice swords, I will come back for more!");
        }
        System.out.printf("The king paid %d gold coins.\n", coins);
        for (String[] line : matrix) {
            System.out.println(String.join("", line));
        }

    }

    private static void moveRight(String[][] matrix) {
        currentCol++;
        if (currentCol == matrix.length) {
            System.out.println("I do not need more swords!");
            matrix[currentRow][currentCol - 1] = "-";
            isFlag = true;
        } else if (matrix[currentRow][currentCol].equals("M")) {
            teleport(matrix);
        } else if (!matrix[currentRow][currentCol].equals("-")) {
            int sword = Integer.parseInt(matrix[currentRow][currentCol]);
            coins += sword;
            matrix[currentRow][currentCol] = "-";
            if (coins >= 65) {
                matrix[currentRow][currentCol] = "A";
                isFlag = true;
            }
        }
    }

    private static void moveLeft(String[][] matrix) {
        currentCol--;
        if (currentCol < 0) {
            System.out.println("I do not need more swords!");
            matrix[currentRow][currentCol + 1] = "-";
            isFlag = true;
        } else if (matrix[currentRow][currentCol].equals("M")) {
            teleport(matrix);
        } else if (!matrix[currentRow][currentCol].equals("-")) {
            int sword = Integer.parseInt(matrix[currentRow][currentCol]);
            coins += sword;
            matrix[currentRow][currentCol] = "-";
            if (coins >= 65) {
                matrix[currentRow][currentCol] = "A";
                isFlag = true;
            }
        }
    }

    private static void moveDown(String[][] matrix) {
        currentRow++;
        if (currentRow == matrix.length) {
            System.out.println("I do not need more swords!");
            matrix[currentRow - 1][currentCol] = "-";
            isFlag = true;
        } else if (matrix[currentRow][currentCol].equals("M")) {
            teleport(matrix);
        } else if (!matrix[currentRow][currentCol].equals("-")) {
            int sword = Integer.parseInt(matrix[currentRow][currentCol]);
            coins += sword;
            matrix[currentRow][currentCol] = "-";
            if (coins >= 65) {
                matrix[currentRow][currentCol] = "A";
                isFlag = true;
            }
        }
    }

    private static void moveUp(String[][] matrix) {
        currentRow--;
        if (currentRow < 0) {
            System.out.println("I do not need more swords!");
            matrix[currentRow + 1][currentCol] = "-";
            isFlag = true;
        } else if (matrix[currentRow][currentCol].equals("M")) {
            teleport(matrix);
        } else if (!matrix[currentRow][currentCol].equals("-")) {
            int sword = Integer.parseInt(matrix[currentRow][currentCol]);
            coins += sword;
            matrix[currentRow][currentCol] = "-";
            if (coins >= 65) {
                matrix[currentRow][currentCol] = "A";
                isFlag = true;
            }
        }
    }

    private static void teleport(String[][] matrix) {
        matrix[currentRow][currentCol] = "-";
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("M")) {
                    currentRow = row;
                    currentCol = col;
                    matrix[currentRow][currentCol] = "-";
                    break;
                }
            }
        }
    }
}
