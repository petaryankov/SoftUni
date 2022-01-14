package day12NestedLoopsExercise;

import java.util.Scanner;

public class P4TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        //double averageScore;
        double presentationScoreSum = 0;
        double allScoreSum = 0;
        int presentationCounter = 0;
        while (!presentationName.equals("Finish")) {
            presentationCounter++;
            for (int i = n; i > 0; i--) {
                double presentationScore = Double.parseDouble(scanner.nextLine());
                // sum of each presentation scores
                presentationScoreSum += presentationScore;
                //sum of all scores
                allScoreSum += presentationScore;
            }//each presentation average score
            double presentationAverageScore = presentationScoreSum / n;
            System.out.printf("%s - %.2f.\n", presentationName, presentationAverageScore);
            presentationScoreSum = 0;
            presentationName = scanner.nextLine();
        }
        double totalAverageScore = allScoreSum / (n * presentationCounter);
        System.out.printf("Student's final assessment is %.2f.", totalAverageScore);
    }
}
