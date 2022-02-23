package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    numbers = Arrays.stream(numbers).map(e -> e = e + 1).toArray();
                    break;
                case "multiply":
                    numbers = Arrays.stream(numbers).map(e -> e = e * 2).toArray();
                    break;
                case "subtract":
                    numbers = Arrays.stream(numbers).map(e -> e = e - 1).toArray();
                    break;
                case "print":
                    System.out.println(Arrays.toString(numbers)
                            .replaceAll("[\\[\\],]", ""));
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
