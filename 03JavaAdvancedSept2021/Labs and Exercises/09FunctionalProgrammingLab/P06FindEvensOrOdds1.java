package day9.FunctionalProgrammingLab;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class P6FindEvensOrOdds1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt() + 1;
        scanner.nextLine();
        String oddOrEven = scanner.nextLine();
        IntStream range = IntStream.range(from, to);
        Predicate<Integer> isEven = e -> e % 2 == 0;
        Predicate<Integer> isOdd = e -> e % 2 != 0;
        Consumer<Integer> print = e -> System.out.printf("%d ", e);

        if (oddOrEven.equals("even")) {
            range.filter(isEven::test).forEach(print::accept);
        } else {
            range.filter(isOdd::test).forEach(print::accept);
        }
    }
}
