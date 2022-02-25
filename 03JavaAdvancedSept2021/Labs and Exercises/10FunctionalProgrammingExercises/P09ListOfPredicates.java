package day10.FunctionalProgrammingExercises;

import java.util.*;
import java.util.stream.Collectors;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<Integer> setNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());
        printDivisible(setNumbers, n);

    }

    private static void printDivisible(Set<Integer> setNumbers, int n) {
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (Integer number : setNumbers) {
                if (i % number == 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
