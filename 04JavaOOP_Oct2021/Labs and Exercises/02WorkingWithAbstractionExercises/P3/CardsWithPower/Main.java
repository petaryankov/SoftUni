package day2.WorkingWithAbstractionExercises.P3.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuits cardSuit = CardSuits.valueOf(scanner.nextLine());
        Card card = new Card(cardRank, cardSuit);
        System.out.printf("Card name: %s of %s; Card power: %d"
                , cardRank.name(), cardSuit.name(), card.getPower());
    }
}
