package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class P04AppliedArithmetic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        Function<int[], int[]> add = e -> Arrays.stream(e).map(n -> n + 1).toArray();
        Function<int[], int[]> multiply = e -> Arrays.stream(e).map(n -> n * 2).toArray();
        Function<int[], int[]> subtract = e -> Arrays.stream(e).map(n -> n - 1).toArray();
        Consumer<int[]> print = e -> System.out.println
                (Arrays.toString(e).replaceAll("[\\[\\],]", ""));

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
                    break;
            }

            command = scanner.nextLine();

        }
    }
}
