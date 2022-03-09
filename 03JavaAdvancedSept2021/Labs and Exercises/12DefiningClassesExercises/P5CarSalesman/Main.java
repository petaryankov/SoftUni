package day12.DefiningClassesExercises.P5CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engines = new HashMap<>();
        int engineLine = Integer.parseInt(scanner.nextLine());
        while (engineLine-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            Engine engine;
            int displacement;
            String efficiency;
            if (input.length == 4) {
                displacement = Integer.parseInt(input[2]);
                efficiency = input[3];
                engine = new Engine(model, power, displacement, efficiency);
            } else if (input.length == 2) {
                engine = new Engine(model, power);
            } else {
                try {
                    displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);

                } catch (NumberFormatException e) {
                    efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                    engines.put(model, engine);
                }
            }
            engines.put(model, engine);
        }
        List<Car> cars = new ArrayList<>();
        int carLines = Integer.parseInt(scanner.nextLine());
        while (carLines-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];
            String engineModel = input[1];
            Car car;
            Engine carEngine = engines.get(engineModel);
            int weight;
            String color;
            if (input.length == 4) {
                weight = Integer.parseInt(input[2]);
                color = input[3];
                car = new Car(carModel, carEngine, weight, color);
            } else if (input.length == 2) {
                car = new Car(carModel, carEngine);
            } else {
                try {
                    weight = Integer.parseInt(input[2]);
                    car = new Car(carModel, carEngine, weight);
                } catch (NumberFormatException e) {
                    color = input[2];
                    car = new Car(carModel, carEngine, color);
                }
            }
            cars.add(car);
        }
        cars.forEach(System.out::println);
    }
}
