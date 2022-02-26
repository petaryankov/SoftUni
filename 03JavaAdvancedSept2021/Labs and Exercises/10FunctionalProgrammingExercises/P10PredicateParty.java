package day10.FunctionalProgrammingExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> people = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Party!")) {

            String command = input.split("\\s+")[0];
            String options = input.split("\\s+")[1];
            String criteria = input.split("\\s+")[2];
            Predicate<String> predicate;

            if ("StartsWith".equals(options)) {
                predicate = e -> e.startsWith(criteria);
            } else if ("EndsWith".equals(options)) {
                predicate = e -> e.endsWith(criteria);
            } else {
                predicate = e -> e.length() == Integer.parseInt(criteria);
            }
            if (command.equals("Double")) {
                List<String> toDouble = new ArrayList<>();
                people.forEach(name -> {
                    if (predicate.test(name)) {
                        toDouble.add(name);
                    }
                });
                people.addAll(toDouble);
            } else {
                List<String> toRemove = new ArrayList<>();
                people.forEach(name -> {
                    if (predicate.test(name)) {
                        toRemove.add(name);
                    }
                });
                people.removeAll(toRemove);
            }

            input = scanner.nextLine();
        }
        if (people.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(Arrays.toString(people.stream().sorted().toArray())
                    .replaceAll("[\\[\\]]", "") + " are going to the party!");
        }
    }
}
