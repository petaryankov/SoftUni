package ExamsPreparation.Exam19February2022;

import java.util.Scanner;

public class P2PawnWars {
    static int whiteRow = -1;
    static int whiteCol = -1;
    static int blackRow = -1;
    static int blackCol = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int row = 0; row < matrix.length; row++) {
            String[] line = scanner.nextLine().split("");
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = line[col];
                if (matrix[row][col].equals("w")) {
                    whiteRow = row;
                    whiteCol = col;
                } else if (matrix[row][col].equals("b")) {
                    blackRow = row;
                    blackCol = col;
                }
            }
        }
        //When a pawn capture another pawn
        if (Math.abs(whiteCol - blackCol) == 1) {
            boolean isBlackWining = (blackRow - whiteRow) % 2 == 0;
            while (Math.abs(whiteRow - blackRow) != 1) {

                whiteRow--;
                if (Math.abs(whiteRow - blackRow) == 1) {
                    break;
                }
                blackRow++;
            }
            String captured = isBlackWining ? getLetter(whiteCol)
                    : getLetter(blackCol);
            int num = isBlackWining ? 8 - whiteRow
                    : 8 - blackRow;
            String winner = isBlackWining ? "Black"
                    : "White";
            System.out.printf("Game over! %s capture on %s%d.", winner, captured, num);
            return;
        }
        //first arrived is winning
        while (whiteRow != 0 && blackRow != 8) {

            whiteRow--;
            int numberWhite = 8 - whiteRow;
            if (numberWhite == 8) {
                String letterWhite = getLetter(whiteCol);
                System.out.printf("Game over! White pawn is promoted to a queen at %s%d."
                        , letterWhite, numberWhite);
                return;
            }
            blackRow++;
            int numberBlack = 8 - blackRow;
            if (numberBlack == 1) {
                String letterBlack = getLetter(blackCol);
                System.out.printf("Game over! Black pawn is promoted to a queen at %s%d."
                        , letterBlack, numberBlack);
                return;
            }


        }
    }

    private static String getLetter(int col) {
        String result = "";
        switch (col) {
            case 0:
                result = "a";
                break;
            case 1:
                result = "b";
                break;
            case 2:
                result = "c";
                break;
            case 3:
                result = "d";
                break;
            case 4:
                result = "e";
                break;
            case 5:
                result = "f";
                break;
            case 6:
                result = "g";
                break;
            case 7:
                result = "h";
                break;

        }
        return result;
    }
}
