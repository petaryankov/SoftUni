package day2.StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P1ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String > stackNumbers = new ArrayDeque<>();

        for (String s : input) {
            stackNumbers.push(s);
        }

        while (!stackNumbers.isEmpty()) {
            System.out.print(stackNumbers.pop() + " ");
        }

    }
}
