package day12.DefiningClassesExercises.P3SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1Km;
    private double distance;

    public Car(String model, double fuelAmount, double fuelCostFor1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Km = fuelCostFor1Km;
        this.distance = 0;
    }

    public void calculateFuel(double km) {
        double fuelConsumption = km * this.fuelCostFor1Km;
        if (fuelConsumption > this.fuelAmount) {
            System.out.println("Insufficient fuel for the drive");
        } else {
            this.fuelAmount -= fuelConsumption;
            this.distance += km;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distance);
    }
}
