package day1.WorkingWithAbstractionLab.P4.HotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private final int multiplier;

    public int getMultiplier() {
        return multiplier;
    }

    Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public static Season parseSeason(String season) {
        switch (season) {
            case "Autumn":
                return AUTUMN;
            case "Spring":
                return SPRING;
            case "Winter":
                return WINTER;
            case "Summer":
                return SUMMER;
            default:
                throw new IllegalArgumentException("Illegal season type " + season);
        }
    }
}
