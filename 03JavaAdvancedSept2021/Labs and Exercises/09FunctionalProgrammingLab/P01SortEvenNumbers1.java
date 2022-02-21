package day9.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1SortEvenNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //filter only even numbers and print
        numbers.removeIf(num -> num % 2 != 0);
        String firstOutput = numbers.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(firstOutput);
        // sort all even numbers and print
        String secondOutput = numbers.stream().sorted().map(String::valueOf).
                collect(Collectors.joining(", "));
        System.out.println(secondOutput);

    }
}
