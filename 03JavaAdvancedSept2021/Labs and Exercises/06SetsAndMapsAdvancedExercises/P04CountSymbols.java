package day6.SetsAndMapsAdvancedExercises;

import java.util.*;

public class P4CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Integer, Integer> chars = new TreeMap<>();
        for (int index = 0; index < text.length(); index++) {
            int symbol = text.charAt(index);
            chars.putIfAbsent(symbol, 0);
            chars.put(symbol, chars.get(symbol) + 1);
        }
        chars.forEach((key, value) -> System.out.printf("%c: %d time/s%n", key, value));
    }
}
