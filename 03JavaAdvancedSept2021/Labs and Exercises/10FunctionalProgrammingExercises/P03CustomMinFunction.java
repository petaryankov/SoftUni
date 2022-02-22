package day10.FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class P03CustomMinFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OptionalInt listOfNumbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).min();
        System.out.println(listOfNumbers.getAsInt());

    }
}
