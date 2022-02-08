package day5.SetsAndMapsAdvancedLab;

import java.text.DecimalFormat;
import java.util.*;

public class P8AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> students = new TreeMap<>();

        while (n-- > 0) {
            String studentName = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();

            students.put(studentName, grades);

        }
        DecimalFormat df = new DecimalFormat("0.################");
        for (var entry : students.entrySet()) {
            double sum = 0;
            for (double score : entry.getValue()) {
                sum += score;
            }
            double average = sum / entry.getValue().length;
            System.out.printf("%s is graduated with %s\n", entry.getKey(), df.format(average));
        }

    }
}
