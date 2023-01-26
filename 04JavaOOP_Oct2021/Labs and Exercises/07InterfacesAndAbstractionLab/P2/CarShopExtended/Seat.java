package day7.InterfacesAndAbstractionLab.P2.CarShopExtended;

public class Seat extends CarImpl implements Sellable {

    private final Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
        
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() +
                getModel() + " sells for " + this.price;
    }
}
