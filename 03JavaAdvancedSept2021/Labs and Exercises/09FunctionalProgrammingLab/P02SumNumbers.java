package day9.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P2SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Function<String, Integer> countFunction = str -> str.split(", ").length;
        Function<String, Integer> sumFunction = str -> Arrays.stream(str.split(", "))
                .mapToInt(Integer::parseInt).sum();
        System.out.println("Count = " + countFunction.apply(input));
        System.out.println("Sum = " + sumFunction.apply(input));

    }
}
