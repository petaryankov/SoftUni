package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<int[], Object> minNum =
                e -> Arrays.stream(e).map(n -> n).min().getAsInt();
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(minNum.apply(numbers));
    }
}
