package day15MapsLambdaAndStreamApiExercise;

import java.util.*;

public class P9ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> sides = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String side = input.split(" \\| ")[0].trim();
                String name = input.split(" \\| ")[1].trim();
                sides.putIfAbsent(side, new ArrayList<>());
                sides.get(side).add(name);

            } else if (input.contains("->")) {
                String side = input.split(" -> ")[1].trim();
                String name = input.split(" -> ")[0].trim();

                for (Map.Entry<String, List<String>> listEntry : sides.entrySet()) {
                    listEntry.getValue().remove(name);
                }
                sides.putIfAbsent(side, new ArrayList<>());
                sides.get(side).add(name);
                System.out.printf("%s joins the %s side!\n", name, side);
            }

            input = scanner.nextLine();
        }
        sides.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    if (entry.getValue().size() != 0) {
                        System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                    }
                    entry.getValue().sort(String::compareTo);
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.println("! " + entry.getValue().get(i));
                    }
                });

    }
}
