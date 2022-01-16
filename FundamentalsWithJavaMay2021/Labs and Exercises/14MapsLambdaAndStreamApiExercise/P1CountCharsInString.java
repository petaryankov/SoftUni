package day15MapsLambdaAndStreamApiExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P1CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> letterCount = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' ') {
                continue;
            }
            if (!letterCount.containsKey(currentChar)) {
                letterCount.put(currentChar, 1);
            } else {
                letterCount.put(currentChar, letterCount.get(currentChar) + 1);
            }
        }
        letterCount.forEach((key, value) -> System.out.println(key + " -> " + value));
//        for (Map.Entry<Character, Integer> charKey : letterCount.entrySet()) {
//            System.out.printf("%c -> %d\n", charKey.getKey(), charKey.getValue());
//        }
    }
}
