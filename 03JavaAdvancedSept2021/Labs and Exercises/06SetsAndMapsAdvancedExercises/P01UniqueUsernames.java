package day6.SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P1UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();
        while (lines-- > 0) {
            String username = scanner.nextLine();
            usernames.add(username);
        }
        usernames.forEach(System.out::println);
    }
}
