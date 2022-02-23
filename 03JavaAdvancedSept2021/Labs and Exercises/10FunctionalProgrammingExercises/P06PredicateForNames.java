package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        Predicate<String> predicate = str -> str.length() <= length;
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(predicate).collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
