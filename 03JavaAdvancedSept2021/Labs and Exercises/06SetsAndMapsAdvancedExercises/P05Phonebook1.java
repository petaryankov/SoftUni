package day6.SetsAndMapsAdvancedExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P5Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String phoneNum = input.split("-")[1];
            phonebook.put(name, phoneNum);
            input = scanner.nextLine();
        }
        String names = scanner.nextLine();
        while (!names.equals("stop")) {
            if (phonebook.containsKey(names)) {
                String phoneNumber = phonebook.get(names);
                System.out.println(names + " -> " + phoneNumber);
            } else {
                System.out.printf("Contact %s does not exist.%n", names);
            }
            names = scanner.nextLine();
        }
    }
}
