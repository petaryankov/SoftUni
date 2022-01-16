package day15MapsLambdaAndStreamApiExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> users = new TreeMap<>();
        Map<String, Integer> courses = new TreeMap<>();

        while (!input.equals("exam finished")) {
            // ban
            String userName = input.split("-")[0];
            if (input.contains("banned")) {
                users.remove(userName);
            } else {
                String course = input.split("-")[1];
                int score = Integer.parseInt(input.split("-")[2]);
                if (users.containsKey(userName) && users.get(userName) < score) {
                    users.put(userName, score);
                }
                users.putIfAbsent(userName, score);

                if (!courses.containsKey(course)) {
                    courses.put(course, 1);
                } else {
                    courses.put(course, courses.get(course) + 1);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        users.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        courses.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
