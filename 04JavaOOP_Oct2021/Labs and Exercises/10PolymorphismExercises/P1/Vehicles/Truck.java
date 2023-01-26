package day10.PolymorphismExercises.P1.Vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleImpl {
    private final static double AC_ADDITIONAL_FUEL_CONSUMPTION = 1.6;
    private final static double REFUEL_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
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
