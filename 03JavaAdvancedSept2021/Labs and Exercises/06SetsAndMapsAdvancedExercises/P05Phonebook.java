package day6.SetsAndMapsAdvancedExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String phone = input.split("-")[1];
            phoneBook.put(name, phone);
            input = scanner.nextLine();
        }
        String toFind = scanner.nextLine();
        while (!toFind.equals("stop")) {
            String toPrint = phoneBook.containsKey(toFind)
                    ? toFind + " -> " + phoneBook.get(toFind)
                    : "Contact " + toFind + " does not exist.";
            System.out.println(toPrint);
            toFind = scanner.nextLine();
        }
    }
}
