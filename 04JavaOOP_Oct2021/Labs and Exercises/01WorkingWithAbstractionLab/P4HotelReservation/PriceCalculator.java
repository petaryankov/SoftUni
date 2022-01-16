package day1.WorkingWithAbstractionLab.P4.HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numOfDays;
    private Season season;
    private Discount discount;

    public PriceCalculator(double pricePerDay, int numOfDays
            , Season season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.numOfDays = numOfDays;
        this.season = season;
        this.discount = discount;
    }

    public double getHolidayPrice() {
        return seasonPrice() * discount.getDiscount();
    }

    private double seasonPrice() {
        return pricePerDay * season.getMultiplier() * numOfDays;
    }

}
