package day9ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine()
                .split(" ")).collect(Collectors.toList());
        while (!command.contains("end")) {
            if (command.contains("Contains")) {
                int numberContains = Integer.parseInt(command.get(1));
                containsNumber(numbers, numberContains);
                //Print even – print all the numbers that are even separated by a space
            } else if (command.contains("Print")) {
                if (command.contains("even")) {
                    printEven(numbers);
                } else {
                    printOdd(numbers);
                }
                //Get sum – print the sum of all the numbers
            } else if (command.contains("Get")) {
                printSum(numbers);
                //Filter ({condition} {number}) – print all the numbers that fulfill that condition.
                // The condition will be either '<', '>', ">=", "<="
            } else if (command.contains("Filter")) {
                String filterCondition = command.get(1);
                int filterIndex = Integer.parseInt(command.get(2));
                printFilter(numbers, filterCondition, filterIndex);

            }

            command = Arrays.stream(scanner.nextLine()
                    .split(" ")).collect(Collectors.toList());
        }
    }

    private static void printFilter(List<Integer> numbers, String condition, int index) {
        switch (condition) {
            case ">":
                for (Integer number : numbers) {
                    if (number > index) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (Integer number : numbers) {
                    if (number >= index) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<":
                for (Integer number : numbers) {
                    if (number < index) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (Integer number : numbers) {
                    if (number <= index) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
        }
    }

    private static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void printOdd(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printEven(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void containsNumber(List<Integer> numbers, int numberContains) {
        boolean isContain = numbers.contains(numberContains);
        if (isContain) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
