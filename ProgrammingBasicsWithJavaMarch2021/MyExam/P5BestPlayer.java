package Exams.MyExam;

import java.util.Scanner;

public class P5BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int topScore = Integer.MIN_VALUE;
        String bestPlayer = "";
        boolean isHatTrick = false;
        while (!playerName.equals("END")) {
            int numGoals = Integer.parseInt(scanner.nextLine());
            if (numGoals >= 3) {
                isHatTrick = true;
            }
            if (numGoals > topScore) {
                topScore = numGoals;
                bestPlayer = playerName;
                if (numGoals >= 10) {
                    break;
                }
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n", bestPlayer);
        if (isHatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", topScore);
        } else {
            System.out.printf("He has scored %d goals.", topScore);
        }
    }
}
