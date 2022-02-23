package day10.FunctionalProgrammingExercises;

import java.util.*;
import java.util.stream.Collectors;

public class P05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        List<String> stringList = Arrays.stream(input.split("\\s+"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        stringList.stream().mapToInt(Integer::parseInt)
                .filter(e -> e % n != 0).forEach(e -> System.out.printf("%d ", e));
    }
}
