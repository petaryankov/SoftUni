package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> printSir = name -> System.out.println("Sir " + name);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList()).forEach(printSir);
    }
}
