package day12.DefiningClassesExercises.P5CarSalesman;

public class Car {
    //A Car has a model, engine, weight and color.
    private String model;
    private Engine engine;
    private int weight = -1;
    private String color = "n/a";

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        String printWeight;
        if (this.weight == -1) {
            printWeight = "n/a";
        } else {
            printWeight = String.valueOf(this.weight);
        }
        StringBuilder sbCar = new StringBuilder();
        sbCar.append(model).append(":").append("\n")
                .append(engine).append("\n")
                .append("Weight: ").append(printWeight).append("\n")
                .append("Color: ").append(color);
        return sbCar.toString();
    }
}
