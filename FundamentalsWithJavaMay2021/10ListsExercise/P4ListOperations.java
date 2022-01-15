package day10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            //•	Add {number} - add number at the end
            if (command[0].equals("Add")) {
                int numberToAdd = Integer.parseInt(command[1]);
                numbers.add(numberToAdd);
                //•	Insert {number} {index} - insert number at given index
            } else if (command[0].equals("Insert")) {
                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                addNumberOfIndex(numbers, index, number);
                //•	Remove {index} - remove that index
            } else if (command[0].equals("Remove")) {
                int index = Integer.parseInt(command[1]);
                removeIndex(numbers, index);
                //•	Shift left {count} - first number becomes last 'count' times
            } else if (command[1].equals("left")) {
                int count = Integer.parseInt(command[2]);
                shiftLeftCount(numbers, count);
                //•	Shift right {count} - last number becomes first 'count' times
            } else if (command[1].equals("right")) {
                int count = Integer.parseInt(command[2]);
                shiftRightCount(numbers, count);
            }

            command = scanner.nextLine().split("\\s+");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }

    private static boolean isValidIndex(List<Integer> numbers, int index) {
        return numbers.size() - 1 >= index && index >= 0;
    }

    private static void shiftRightCount(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastValueNumber = numbers.get(numbers.size() - 1);
            numbers.add(0, lastValueNumber);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void shiftLeftCount(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int firstValueNumber = numbers.get(0);
            int lastIndex = numbers.size();
            numbers.add(lastIndex, firstValueNumber);
            numbers.remove(0);
        }
    }

    private static void removeIndex(List<Integer> numbers, int index) {
        if (isValidIndex(numbers, index)) {
            numbers.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void addNumberOfIndex(List<Integer> numbers, int index, int number) {
        if (isValidIndex(numbers, index)) {
            numbers.add(index, number);
        } else {
            System.out.println("Invalid index");
        }
    }
}
