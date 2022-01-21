package day6.SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P6A_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resources.containsKey(resource)) {
                resources.put(resource, resources.get(resource) + quantity);
            } else {
                resources.put(resource, quantity);
            }

            input = scanner.nextLine();
        }
        resources.forEach((key, value)-> System.out.println(key + " -> " + value));
    }
}
