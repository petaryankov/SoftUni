package day14MapsLambdaStreamApiLab;

import java.util.*;

public class P3OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sequence = scanner.nextLine().split(" ");

        Map<String, Integer> words = new LinkedHashMap<>();

        for (String s : sequence) {
            s = s.toLowerCase(Locale.ROOT);
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            }
            words.putIfAbsent(s, 1);
        }
        ArrayList<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }
        for (int word = 0; word < odds.size(); word++) {
            if (word < odds.size() - 1) {
                System.out.print(odds.get(word) + ", ");
            } else {
                System.out.print(odds.get(word));
            }
        }

    }
}
