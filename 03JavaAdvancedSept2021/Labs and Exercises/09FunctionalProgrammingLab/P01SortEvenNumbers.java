package day9.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P1SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(", ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        Function<Stream<Integer>, String> mutation = x -> x.map(String::valueOf)
                .collect(Collectors.joining(", "));
        String firstOutput = mutation.apply(evenNumbers.stream());
        System.out.println(firstOutput);
        String secondOutput = mutation.apply(evenNumbers.stream().sorted());
        System.out.println(secondOutput);
    }
}
