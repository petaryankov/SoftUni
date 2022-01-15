package day10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        int[] bomb = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int boom = bomb[0];
        while (numbers.contains(boom)) {
            removeLeft(numbers, bomb);
            removeRight(numbers, bomb);
            numbers.remove((Integer) boom);
        }
        printSum(numbers);
    }

    private static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void removeRight(List<Integer> numbers, int[] bomb) {
        int power = bomb[1];
        while (power > 0) {
            int index = numbers.indexOf(bomb[0]);
            index++;
            if (index > numbers.size() - 1) {
                break;
            }
            numbers.remove(index);
            power--;
        }
    }

    private static void removeLeft(List<Integer> numbers, int[] bomb) {
        int index = numbers.indexOf(bomb[0]);
        int power = bomb[1];
        while (power > 0) {
            index--;
            if (index < 0) {
                break;
            }
            numbers.remove(index);
            power--;
        }
    }
}
