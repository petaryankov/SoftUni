package day2.WorkingWithAbstractionExercises.P3.CardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuits cardSuit;

    public Card(CardRank cardRank, CardSuits cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int getPower() {
        return this.cardRank.getRankPower() + this.cardSuit.getSuitPower();
    }

}
