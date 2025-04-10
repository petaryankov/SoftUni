package day7.InterfacesAndAbstractionLab.P2.CarShopExtended;

public class Audi extends CarImpl implements Rentable {
    private final Integer minRentDay;
    private final Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced
            , Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        double price = getMinRentDay() * getPricePerDay();
        return super.toString() + System.lineSeparator() +
                "Minimum rental period of " + this.minRentDay +" days. Price per day " +  this.pricePerDay;
    }
}
