package day10.PolymorphismExercises.P2.VehiclesExtension;

public class Truck extends VehicleImpl {
    private final static double AC_ADDITIONAL_FUEL_CONSUMPTION = 1.6;
    private final static double REFUEL_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_FUEL_CONSUMPTION);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * REFUEL_PERCENTAGE);
    }
}
