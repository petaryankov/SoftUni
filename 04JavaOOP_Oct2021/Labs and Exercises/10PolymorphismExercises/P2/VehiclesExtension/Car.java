package day10.PolymorphismExercises.P2.VehiclesExtension;

public class Car extends VehicleImpl {
    private final static double AC_ADDITIONAL_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_FUEL_CONSUMPTION);
    }

}
