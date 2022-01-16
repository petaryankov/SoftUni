package day15MapsLambdaAndStreamApiExercise;

import java.util.*;

public class P7StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();
        Map<String, Double> studentsAverage = new LinkedHashMap<>();

        int numOfStudents = Integer.parseInt(scanner.nextLine());

        for (int line = 1; line <= numOfStudents; line++) {
            String studentName = scanner.nextLine();
            double studentScore = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(studentName, new ArrayList<>());
            students.get(studentName).add(studentScore);
        }
        for (String student : students.keySet()) {
            double sum = 0;
            for (int i = 0; i < students.get(student).size(); i++) {
                sum += students.get(student).get(i);
            }
            double average = sum / students.get(student).size();
            if (average >= 4.50) {
            studentsAverage.put(student, average);
            }
        }
        studentsAverage.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach((e) -> System.out.printf("%s -> %.2f\n", e.getKey(), e.getValue()));
    }
}
