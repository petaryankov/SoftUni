package day9ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class P7RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        removeNegatives(numbers);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void removeNegatives(List<Integer> numbers) {
        numbers.removeIf(number -> number < 0);
    }
}
