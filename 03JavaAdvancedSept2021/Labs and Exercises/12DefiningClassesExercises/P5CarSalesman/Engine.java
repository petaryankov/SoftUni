package day12.DefiningClassesExercises.P5CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement = -1;
    private String efficiency = "n/a";

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        String printDisplacement;
        if (displacement == -1) {
            printDisplacement = "n/a";
        } else {
            printDisplacement = displacement + "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(model).append(":").append("\n")
                .append("Power: ").append(power).append("\n")
                .append("Displacement: ").append(printDisplacement).append("\n")
                .append("Efficiency: ").append(efficiency);
        return stringBuilder.toString();
    }

    public String getModel() {
        return model;
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
}
