package day10WhileLoopExercise;

import java.util.Scanner;

public class P4Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = 10000;
        int sumSteps = 0;
        while (sumSteps < target) {

            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                sumSteps += Integer.parseInt(scanner.nextLine());
                break;
            }
            sumSteps += Integer.parseInt(input);
        }
        if (sumSteps < target) {
            System.out.printf("%d more steps to reach goal.", target - sumSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - target);
        }
    }
}
