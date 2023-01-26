package day10.PolymorphismExercises.P1.Vehicles;

import java.text.DecimalFormat;

public class Car extends VehicleImpl {
    private final static double AC_ADDITIONAL_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_FUEL_CONSUMPTION);
    }

}
