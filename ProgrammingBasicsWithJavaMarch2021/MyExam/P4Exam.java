package Exams.MyExam;

import java.util.Scanner;

public class P4Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        //•	За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        int numStudents = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int regularStudents = 0;
        int poorStudents = 0;
        int fail = 0;
        double sum = 0;
        double average = 0;
        for (int scores = numStudents; scores > 0; scores--) {
            double studentScore = Double.parseDouble(scanner.nextLine());
            sum += studentScore;
            if (studentScore >= 5.0) {
                topStudents++;
            } else if (studentScore >= 4) {
                regularStudents++;
            } else if (studentScore >= 3) {
                poorStudents++;
            } else {
                fail++;
            }

        }
        double percentTop = 1.0 * topStudents / numStudents * 100;
        double percentRegular = 1.0 * regularStudents / numStudents * 100;
        double percentPoor = 1.0 * poorStudents / numStudents * 100;
        double percentFail = 1.0 * fail / numStudents * 100;
        average = sum / numStudents;
        System.out.printf("Top students: %.2f%%\n",percentTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",percentRegular);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",percentPoor);
        System.out.printf("Fail: %.2f%%\n",percentFail);
        System.out.printf("Average: %.2f",average);
    }
}
