package day2.WorkingWithAbstractionExercises.P4.TrafficLights;

public class TrafficLight {
    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }


    public void changeLight() {
        switch (this.light) {
            case RED:
                this.light = Light.GREEN;
                break;
            case GREEN:
                this.light = Light.YELLOW;
                break;
            case YELLOW:
                this.light = Light.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.light.toString();
    }
}
