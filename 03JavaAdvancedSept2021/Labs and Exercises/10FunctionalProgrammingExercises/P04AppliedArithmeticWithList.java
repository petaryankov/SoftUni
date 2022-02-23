package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04AppliedArithmeticWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        Function<List<Integer>, List<Integer>> add = e -> e.stream().map(num -> num + 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = e -> e.stream().map(n -> n * 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = e -> e.stream().map(n -> n - 1).collect(Collectors.toList());
        Consumer<List<Integer>> print = e -> e.forEach(n -> System.out.printf("%d ", n));
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();

        }
    }
}
