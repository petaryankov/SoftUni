package day5.SetsAndMapsAdvancedLab;

import java.util.*;

public class P5AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();

        for (int student = 1; student <= numStudents; student++) {
            String[] studentData = scanner.nextLine().split("\\s+");
            String studentName = studentData[0];
            double studentScore = Double.parseDouble(studentData[1]);

            students.putIfAbsent(studentName, new ArrayList<>());
            students.get(studentName).add(studentScore);
        }
        for (var student : students.entrySet()) {
            double sum = 0;
            System.out.printf("%s -> ", student.getKey());
            for (int index = 0; index < student.getValue().size(); index++) {
                System.out.printf("%.2f ", student.getValue().get(index));
                sum += student.getValue().get(index);
            }
            double average = sum / student.getValue().size();
            System.out.printf("(avg: %.2f)\n", average);
        }
    }
}
