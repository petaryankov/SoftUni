package day6.SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P09UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> users = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String iP = data[0].substring(3);
            String user = data[2].split("=")[1];

            users.putIfAbsent(user, new LinkedHashMap<>());
            users.get(user).putIfAbsent(iP, 0);
            users.get(user).put(iP, users.get(user).get(iP) + 1);

            input = scanner.nextLine();
        }
        users.forEach((key, value) -> {
            System.out.println(key + ":");
            if (value.size() == 1) {
                value.forEach((ip, count) -> System.out.println(ip + " => " + count + "."));
            } else {
                StringBuilder sb = new StringBuilder();
                value.forEach((ip, count) -> {

                    String output = String.format("%s => %d, ", ip, count);
                    sb.append(output);

                });
                String substring = sb.substring(0, sb.length() - 2);
                System.out.println(substring + ".");
            }
        });
    }
}
