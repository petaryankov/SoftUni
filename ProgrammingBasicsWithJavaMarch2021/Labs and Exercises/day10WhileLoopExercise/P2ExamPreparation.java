package day10WhileLoopExercise;

import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        String taskType = scanner.nextLine();

        double average = 0;
        int failCounter = 0;
        int scoreCounter = 0;
        String lastTask = "";
        while (!taskType.equals("Enough")) {
            lastTask = taskType;
            int grade = Integer.parseInt(scanner.nextLine());
            scoreCounter++;
            average += grade;
            if ( grade <= 4) {
                failCounter++;
                if (failCounter == poorGrades) {
                    break;
                }
            }
            taskType = scanner.nextLine();
        }
        average /= scoreCounter;
        if (failCounter == poorGrades) {
            System.out.printf("You need a break, %d poor grades.", failCounter);
        } else {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s\n", average, scoreCounter, lastTask);
        }
    }
}
