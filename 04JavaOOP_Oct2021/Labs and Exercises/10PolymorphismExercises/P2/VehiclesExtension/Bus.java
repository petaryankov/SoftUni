package day10.PolymorphismExercises.P2.VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends VehicleImpl {
    private final static double AC_ADDITIONAL_FUEL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_FUEL_CONSUMPTION);
    }

    public String driveEmpty(double distance) {
        double fuelNeeded = distance * (super.getFuelConsumption() - AC_ADDITIONAL_FUEL_CONSUMPTION);
        if (fuelNeeded > super.getFuelQuantity()) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        DecimalFormat df = new DecimalFormat("##.##");
        super.setFuelQuantity(getFuelQuantity() - fuelNeeded);
        return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
    }
}
