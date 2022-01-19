package day5.SetsAndMapsAdvancedLab;

import java.util.*;
import java.util.stream.Collectors;

public class P3VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet :: new));
        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet:: new));
        boolean isEmpty = false;

        for (int round = 1; round <= 50; round++) {
            Iterator<Integer> firstIterator = firstPlayer.iterator();
            Iterator<Integer> secondIterator = secondPlayer.iterator();
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                isEmpty = true;
                if (firstPlayer.isEmpty()) {
                    System.out.println("Second player win!");
                } else {
                    System.out.println("First player win!");
                }
                break;
            }
            int firsPlayerCard = firstIterator.next();
            firstIterator.remove();
            int secondPlayerCard = secondIterator.next();
            secondIterator.remove();
            if (firsPlayerCard > secondPlayerCard) {
                firstPlayer.add(firsPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (firsPlayerCard < secondPlayerCard) {
                secondPlayer.add(firsPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
        }
        if (!isEmpty) {
            if (firstPlayer.size() > secondPlayer.size()) {
                System.out.println("First player win!");
            } else if (secondPlayer.size() > firstPlayer.size()) {
                System.out.println("Second player win!");
            } else {
                System.out.println("Draw!");
            }
        }
    }
}
