package day10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            // Delete {element} - delete all elements in the array, which are equal to the given element
            if (command[0].equals("Delete")) {
                int number = Integer.parseInt(command[1]);
                deleteAllEquals(numbers, number);
                numbers.remove(Integer.valueOf(number));
                // Insert {element} {position} - insert element at the given position
            } else if (command[0].equals("Insert")) {
                int element = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);
                numbers.add(position, element);
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void deleteAllEquals(List<Integer> numbers, int number) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.remove(Integer.valueOf(number));
        }

    }
}
