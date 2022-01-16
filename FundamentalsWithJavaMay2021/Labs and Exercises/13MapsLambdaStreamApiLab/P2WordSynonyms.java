package day14MapsLambdaStreamApiLab;

import java.util.*;

public class P2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSynonyms = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> words = new LinkedHashMap<>();
        List<String> synonyms = new ArrayList<>();
        for (int i = 1; i <= numOfSynonyms; i++) {
            String word = scanner.nextLine();
            String wordSynonym = scanner.nextLine();
            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
            }
            words.get(word).add(wordSynonym);
        }
        for (Map.Entry<String, List<String>> stringListEntry : words.entrySet()) {
            System.out.printf("%s - %s\n", stringListEntry.getKey()
                    , String.join(", ", stringListEntry.getValue()));
        }
    }
}
