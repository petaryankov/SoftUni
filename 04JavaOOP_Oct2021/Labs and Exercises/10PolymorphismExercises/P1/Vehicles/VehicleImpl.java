package day10.PolymorphismExercises.P1.Vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{
    private double fuelQuantity;
    private double fuelConsumption;

    public VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;
        if (fuelNeeded > this.fuelQuantity) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        DecimalFormat df = new DecimalFormat("##.##");
        this.fuelQuantity -= fuelNeeded;
        return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km ";
    }
}
