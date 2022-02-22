package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03CustomMinFunction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<Integer[], Integer> minNum =
                e -> Arrays.stream(e).mapToInt(num -> num).min().getAsInt();
        Set<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toSet());
        System.out.println(minNum.apply(numbers.toArray(new Integer[0])));
    }
}
