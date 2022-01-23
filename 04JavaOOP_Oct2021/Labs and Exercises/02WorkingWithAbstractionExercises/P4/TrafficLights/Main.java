package day2.WorkingWithAbstractionExercises.P4.TrafficLights;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Light[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Light::valueOf).toArray(Light[]::new);
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (Light light : lights) {
            TrafficLight trafficLight = new TrafficLight(light);
            trafficLights.add(trafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            trafficLights.forEach(TrafficLight::changeLight);
            trafficLights.forEach(e -> System.out.print(e + " "));
            System.out.println();
        }

    }
}
