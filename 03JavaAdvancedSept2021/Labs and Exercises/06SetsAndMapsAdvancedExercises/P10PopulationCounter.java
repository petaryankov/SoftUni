package day6.SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();
        while (!input.equals("report")) {
            String[] data = input.split("\\|");
            String city = data[0];
            String country = data[1];
            long population = Long.parseLong(data[2]);
            countries.putIfAbsent(country, new LinkedHashMap<>());
            countries.get(country).put(city, population);

            input = scanner.nextLine();
        }
        countries.entrySet().stream().sorted((c1, c2) -> {
            long count1 = c1.getValue().values().stream().mapToLong(e -> e).sum();
            long count2 = c2.getValue().values().stream().mapToLong(e -> e).sum();
            return Long.compare(count2, count1);
        }).forEach(country -> {
            long totalPopulation = country.getValue().values().stream().mapToLong(e -> e).sum();
            System.out.printf("%s (total population: %d)\n", country.getKey(), totalPopulation);
            country.getValue().entrySet().stream()
                    .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                    .forEach(e ->
                            System.out.printf("=>%s: %d\n", e.getKey(), e.getValue());
                    );

        });
    }
}
