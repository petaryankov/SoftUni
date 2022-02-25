package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted((e1, e2) -> {
                    int result = Integer
                            .compare(Math.abs(e1 % 2 ),Math.abs(e2 % 2));
                    if (result == 0) {
                        result = e1 - e2;
                    }
                    return result;
                }).map(e -> e + " ").forEach(System.out::print);
    }
}
