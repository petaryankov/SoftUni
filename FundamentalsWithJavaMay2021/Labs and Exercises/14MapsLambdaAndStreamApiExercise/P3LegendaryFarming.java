package day15MapsLambdaAndStreamApiExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P3LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new TreeMap<>();
        Map<String, Integer> junkMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        boolean flag = false;

        while (!flag) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();
                if (material.equals("shards")
                        || material.equals("fragments")
                        || material.equals("motes")) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                } else {
                    if (!junkMaterials.containsKey(material)) {
                        junkMaterials.put(material, quantity);
                    } else {
                        junkMaterials.put(material, junkMaterials.get(material) + quantity);
                    }
                }
                if (keyMaterials.get("shards") >= 250) {
                    keyMaterials.put("shards", keyMaterials.get("shards") - 250);
                    System.out.println("Shadowmourne obtained!");
                    flag = true;
                    break;

                } else if (keyMaterials.get("fragments") >= 250) {
                    keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
                    System.out.println("Valanyr obtained!");
                    flag = true;
                    break;
                } else if (keyMaterials.get("motes") >= 250) {
                    keyMaterials.put("motes", keyMaterials.get("motes") - 250);
                    System.out.println("Dragonwrath obtained!");
                    flag = true;
                    break;
                }
            }

        }
        keyMaterials.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMaterials.forEach((key, value) -> System.out.println( key + ": " + value));

    }
}
