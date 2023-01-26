
import java.util.Scanner;
import java.util.StringJoiner;

public class TreasureHunt {
    static int row = 0;
    static int col = 0;
    static StringJoiner result = new StringJoiner(", ");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s++");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[][] matrix = new String[n][m];

        for (int r = 0; r < matrix.length; r++) {
            String[] line = scanner.nextLine().split("\\s++");
            for (int c = 0; c < matrix.length; c++) {
                matrix[r][c] = line[c];
                if (matrix[r][c].equals("Y")) {
                    row = r;
                    col = c;
                }
            }
        }
        boolean isFound = false;
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
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
            command = scanner.nextLine();

        }
        if (matrix[row][col].equals("X")) {
                System.out.println("I've found the treasure!");
                System.out.print("The right path is ");
                System.out.println(result);
        } else {
            System.out.println("The map is fake!");
        }

    }

    private static void moveRight(String[][] matrix) {
        col++;
        if (isOutOfBound(matrix)) {
            col--;
        } else if (matrix[row][col].equals("T")) {
            col--;
        } else {
            result.add("right");
        }
    }

    private static void moveLeft(String[][] matrix) {
        col--;
        if (isOutOfBound(matrix)) {
            col++;
        } else if (matrix[row][col].equals("T")) {
            col++;
        } else {
            result.add("left");
        }
    }

    private static void moveDown(String[][] matrix) {
        row++;
        if (isOutOfBound(matrix)) {
            row--;
        } else if (matrix[row][col].equals("T")) {
            row--;
        } else {
            result.add("down");
        }
    }

    private static void moveUp(String[][] matrix) {
        row--;
        if (isOutOfBound(matrix)) {
            row++;
        } else if (matrix[row][col].equals("T")) {
            row++;
        } else {
            result.add("up");
        }
    }

    private static boolean isOutOfBound(String[][] matrix) {
        return row < 0 || row > matrix.length - 1 || col < 0 || col > matrix[row].length - 1;
    }
}
