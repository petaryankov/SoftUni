package day6.SetsAndMapsAdvancedExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P12LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> specialItems = new TreeMap<>();
        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);
        Map<String, Integer> items = new TreeMap<>();
        boolean isObtained = false;
        while (true) {
            String[] data = input.split("\\s+");
            int count = 0;
            String item;
            for (int i = 0; i < data.length; i++) {
                if (i % 2 == 0) {
                    count = Integer.parseInt(data[i]);
                } else {
                    item = data[i].toLowerCase();
                    if (item.equals("shards") || item.equals("fragments")
                            || item.equals("motes")) {
                        specialItems.put(item, specialItems.get(item) + count);
                        if (specialItems.get("shards") >= 250) {
                            System.out.println("Shadowmourne obtained!");
                            specialItems.put("shards", specialItems.get("shards") - 250);
                            isObtained = true;
                            break;
                        } else if (specialItems.get("fragments") >= 250) {
                            System.out.println("Valanyr obtained!");
                            specialItems.put("fragments", specialItems.get("fragments") - 250);
                            isObtained = true;
                            break;
                        } else if (specialItems.get("motes") >= 250) {
                            System.out.println("Dragonwrath obtained!");
                            specialItems.put("motes", specialItems.get("motes") - 250);
                            isObtained = true;
                            break;
                        }
                    } else {
                        items.putIfAbsent(item, 0);
                        items.put(item, items.get(item) + count);
                    }
                }

            }
            if (isObtained) {
                break;
            }
            input = scanner.nextLine();
        }

        specialItems.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
        items.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
    }
}
