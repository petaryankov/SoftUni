package day9.FunctionalProgrammingLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class P5FilterByAge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> names = new LinkedHashMap<>();
        while (lines-- > 0) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            names.put(name, age);
        }
        String condition = scanner.nextLine();
        int byAge = Integer.parseInt(scanner.nextLine());
        Stream<Map.Entry<String, Integer>> older = names.entrySet().stream().filter(e -> e.getValue() >= byAge);
        Stream<Map.Entry<String, Integer>> younger = names.entrySet().stream().filter(e -> e.getValue() <= byAge);
        boolean isOlder = condition.equals("older");
        //older

        String[] sort = scanner.nextLine().split("\\s+");
        if (sort.length == 2) {
            //name amd age
            if (isOlder) {
                older.forEach(e -> System.out.printf("%s - %d\n", e.getKey(), e.getValue()));
            } else {
                younger.forEach(e -> System.out.printf("%s - %d\n", e.getKey(), e.getValue()));
            }
        } else if (sort[0].equals("name")) {
            //name
            if (isOlder) {
                older.forEach(e -> System.out.printf("%sn", e.getKey()));
            } else {
                younger.forEach(e -> System.out.printf("%s\n", e.getKey()));
            }

        } else {
            //age
            if (isOlder) {
                older.forEach(e -> System.out.printf("%d\n", e.getValue()));
            } else {
                younger.forEach(e -> System.out.printf("%d\n", e.getValue()));
            }
        }
    }
}
