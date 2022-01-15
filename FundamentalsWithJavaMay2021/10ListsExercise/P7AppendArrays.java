package day10ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> list = Arrays.stream(input
                .split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);

            System.out.println(list.toString()
                    .replaceAll("[\\[\\],]"," ")
            .replaceAll("\\s+", " ").trim());
    }
}
