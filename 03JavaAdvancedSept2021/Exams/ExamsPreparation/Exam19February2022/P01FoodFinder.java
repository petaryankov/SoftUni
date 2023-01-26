package ExamsPreparation.Exam19February2022;

import java.util.*;

public class P01FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> vowelsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(e -> vowelsQueue.offer(e.charAt(0)));
        ArrayDeque<Character> consonantsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(e -> consonantsStack.push(e.charAt(0)));
        String[] words = {"pear", "flour", "pork", "olive"};
        String[] wordsToFind = {"****", "*****", "****", "*****"};
        while (!consonantsStack.isEmpty()) {
            char currentVowel = vowelsQueue.poll();
            vowelsQueue.offer(currentVowel);
            char currentConsonant = consonantsStack.pop();
            for (int i = 0; i < words.length; i++) {
                StringBuilder sb = new StringBuilder(wordsToFind[i]);
                    int currIndexVowel = words[i].indexOf(currentVowel);
                    int currIndexCons = words[i].indexOf(currentConsonant);
                    if (currIndexVowel >= 0) {
                        sb.setCharAt(currIndexVowel, currentVowel);
                        wordsToFind[i] = sb.toString();
                    }
                    if (currIndexCons >= 0) {
                        sb.setCharAt(currIndexCons, currentConsonant);
                        wordsToFind[i] = sb.toString();
                    }
            }
        }
        List<String> foundWords = new ArrayList<>();
        Arrays.stream(wordsToFind).filter(e -> !e.contains("*"))
                .forEach(foundWords::add);
        if (!foundWords.isEmpty()) {
            System.out.println("Words found: " + foundWords.size());
            foundWords.forEach(System.out::println);
        }
    }
}
