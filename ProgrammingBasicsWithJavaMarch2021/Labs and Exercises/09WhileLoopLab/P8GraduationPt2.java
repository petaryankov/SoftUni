package day9WhileLoopLab;

import java.util.Scanner;

public class P8GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int fail = 0;
        int grade = 0;
        int numScore = 0;
        double scoreSum = 0;

        while (true) {
            double score = Double.parseDouble(scanner.nextLine());
            numScore++;
            grade++;
            if (score < 4) {
                fail++;
                grade--;
                scoreSum += score;
                if (fail == 2) {
                    grade++;
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }
            } else {
                scoreSum += score;
            }
            if (grade == 12) {
                scoreSum = scoreSum / numScore;
                System.out.printf("%s graduated. Average grade: %.2f", name, scoreSum);
                break;
            }
        }
    }
}
