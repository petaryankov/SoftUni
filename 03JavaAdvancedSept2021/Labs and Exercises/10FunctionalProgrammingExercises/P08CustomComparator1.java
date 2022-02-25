package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08CustomComparator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> compareFirstEven = ((e1, e2) -> {
            if ((e1 % 2 == 0) && (e2 % 2 != 0)) {
                return -1;
            } else if ((e1 % 2 != 0) && (e2 % 2 == 0)) {
                return 1;
            } else {
                return e1.compareTo(e2);

            }
        });
        numbers.stream().sorted(compareFirstEven).map(e -> e + " ")
                .forEach(System.out::print);
    }
}
