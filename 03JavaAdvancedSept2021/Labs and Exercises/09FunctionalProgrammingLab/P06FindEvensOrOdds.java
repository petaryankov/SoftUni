package day9.FunctionalProgrammingLab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P6FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int fromNum = Integer.parseInt(input.split(" ")[0]);
        int toNumber = Integer.parseInt(input.split(" ")[1]) + 1;
        String oddEven = scanner.nextLine();
        IntStream.range(fromNum, toNumber)
                .filter(num -> {
                    if (oddEven.equals("odd")) {
                        return num % 2 != 0;
                    } else {
                        return num % 2 == 0;
                    }
                }).forEach(e -> System.out.printf("%d ", e));

    }
}
