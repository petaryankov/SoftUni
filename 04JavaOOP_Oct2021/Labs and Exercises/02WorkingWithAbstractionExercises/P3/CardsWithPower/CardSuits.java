package day2.WorkingWithAbstractionExercises.P3.CardsWithPower;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitPower;

    public int getSuitPower() {
        return suitPower;
    }

    CardSuits(int suitPower) {
        this.suitPower = suitPower;
    }

}
