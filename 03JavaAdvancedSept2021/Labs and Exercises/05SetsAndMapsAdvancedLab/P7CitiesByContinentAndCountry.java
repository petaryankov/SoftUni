package day5.SetsAndMapsAdvancedLab;

import java.util.*;

public class P7CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continentsData = new LinkedHashMap<>();
        while (n-- > 0) {
            String data = scanner.nextLine();
            String continent = data.split(" ")[0];
            String country = data.split(" ")[1];
            String city = data.split(" ")[2];
            continentsData.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countryCity = continentsData.get(continent);
            countryCity.putIfAbsent(country, new ArrayList<>());
            countryCity.get(country).add(city);
        }

        continentsData.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((key1, value1) -> System.out.println("  " + key1 + " -> " +
                    String.join(", ", value1)));
        });
    }
}
