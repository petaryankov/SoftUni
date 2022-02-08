package day6.SetsAndMapsAdvancedExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P11LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, Integer>> users = new TreeMap<>();
        while (lines-- > 0) {
            String[] data = scanner.nextLine().split(" ");
            String iP = data[0];
            String user = data[1];
            int duration = Integer.parseInt(data[2]);
            users.putIfAbsent(user, new TreeMap<>());
            users.get(user).putIfAbsent(iP, 0);
            users.get(user).put(iP, users.get(user).get(iP) + duration);
        }
        users.forEach((key, value) -> {
            int totalDuration = value.values().stream().mapToInt(e->e).sum();
            System.out.printf("%s: %d ", key, totalDuration);
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            value.forEach((ik, iv)-> sb.append(ik).append(", "));
            sb.replace(sb.length()-2, sb.length(), "]");
            System.out.println(sb);
        });
    }
}
