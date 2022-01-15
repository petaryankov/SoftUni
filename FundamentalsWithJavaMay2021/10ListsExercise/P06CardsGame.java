package day10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P6CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        compareDecs(firstDeck, secondDeck);
        int sum = 0;
        if (firstDeck.isEmpty()) {
            for (Integer integer : secondDeck) {
                sum += integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        } else {
            for (Integer integer : firstDeck) {
                sum += integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        }
    }

    private static void compareDecs(List<Integer> firstDeck, List<Integer> secondDeck) {

        while (firstDeck.size() - 1 >= 0 && secondDeck.size() - 1 >= 0) {
            int dec1 = firstDeck.get(0);
            int dec2 = secondDeck.get(0);
            if (dec1 > dec2) {
                firstDeck.add(dec1);
                firstDeck.add(dec2);
                firstDeck.remove(0);
                secondDeck.remove(0);
            } else if (dec1 < dec2) {
                secondDeck.add(dec2);
                secondDeck.add(dec1);
                firstDeck.remove(0);
                secondDeck.remove(0);
            } else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }
    }
}
