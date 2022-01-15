package day10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());
        List<String> command = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        while (!command.contains("end")) {
            if (command.contains("Add")) {
                int addWagon = Integer.parseInt(command.get(1));
                numbers.add(addWagon);
            } else {
                int passengers = Integer.parseInt(command.get(0));
                fillPassengers(numbers, capacity, passengers);
            }

            command = Arrays.stream(scanner.nextLine()
                    .split(" ")).collect(Collectors.toList());
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void fillPassengers(List<Integer> numbers, int capacity, int passengers) {
        for (int index = 0; index < numbers.size(); index++) {
            int sum = numbers.get(index) + passengers;
            if (sum <= capacity) {
                numbers.set(index, sum);
                break;
            }
        }
    }
}
