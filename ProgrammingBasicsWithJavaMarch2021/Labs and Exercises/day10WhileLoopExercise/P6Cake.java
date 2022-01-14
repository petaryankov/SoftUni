package day10WhileLoopExercise;

import java.util.Scanner;

public class P6Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeLength = Integer.parseInt(scanner.nextLine());
        int cakeWidth = Integer.parseInt(scanner.nextLine());

        int cakePieces = cakeLength * cakeWidth;
        int takenPieces = 0;
        boolean isStop = false;
        while (takenPieces < cakePieces) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                isStop = true;
                break;
            }
            takenPieces += Integer.parseInt(input);
        }
        if (isStop) {
            System.out.printf("%d pieces are left.", cakePieces - takenPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", takenPieces - cakePieces);
        }
    }
}
