package day6.SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P7FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> usersEmails = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();
            boolean isCorrect = !email.toLowerCase().endsWith("us")
                    && !email.toLowerCase().endsWith("uk")
                    && !email.toLowerCase().endsWith("com");

            if (isCorrect) {
                usersEmails.put(name, email);
            }
            input = scanner.nextLine();
        }
        usersEmails.forEach((key, val) -> System.out.println(key + " -> " + val));
    }
}
