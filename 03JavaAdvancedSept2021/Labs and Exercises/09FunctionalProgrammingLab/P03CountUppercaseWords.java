package day9.FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P3CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        Predicate<String> predicate = str -> Character.isUpperCase(str.charAt(0));
        List<String> listWords = Arrays.stream(words)
                        .filter(predicate).collect(Collectors.toList());
        System.out.println(listWords.size());
        System.out.println(String.join(System.lineSeparator(), listWords));

    }
}
