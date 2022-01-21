package day6.SetsAndMapsAdvancedExercises;

import java.util.*;

public class P8HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, HashSet<String>> playersCards = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String name = input.substring(0, input.indexOf(':') + 2);
            String strCards = input.substring(input.indexOf(':') + 2);
            String[] arrCards = strCards.split(", ");
            HashSet<String> cards = new HashSet<>(List.of(arrCards));
            if (playersCards.containsKey(name)) {
                HashSet<String> currentCards = playersCards.get(name);
                currentCards.addAll(cards);
                playersCards.put(name, currentCards);
            } else {
                playersCards.put(name, cards);

            }
            input = scanner.nextLine();
        }
        playersCards.forEach((key, value) -> {
            int cardPoints = getCardsPoints(value);
            System.out.printf("%s%d%n", key, cardPoints);
        });

    }

    private static int getCardsPoints(HashSet<String> value) {
        int cardPoints = 0;
        for (String s : value) {
            int firstCard;
            int secondCard;

            if (s.length() == 3) {
                firstCard = 10;
            } else if (s.charAt(0) == 'J') {
                firstCard = 11;
            } else if (s.charAt(0) == 'Q') {
                firstCard = 12;
            } else if (s.charAt(0) == 'K') {
                firstCard = 13;
            } else if (s.charAt(0) == 'A') {
                firstCard = 14;
            } else {
                firstCard = Integer.parseInt(String.valueOf(s.charAt(0)));
            }
            int lastChar = s.length() - 1;
            if (s.charAt(lastChar) == 'C') {
                secondCard = 1;
            } else if (s.charAt(lastChar) == 'D') {
                secondCard = 2;
            } else if (s.charAt(lastChar) == 'H') {
                secondCard = 3;
            } else {
                secondCard = 4;
            }
            cardPoints += firstCard * secondCard;

        }
        return cardPoints;
    }
}
