package day12.DefiningClassesExercises.P4RawData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();

        while (line-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            Engine engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];
            int counter = 0;
            for (int index = 5; index < input.length; index += 2) {
                double tirePressure = Double.parseDouble(input[index]);
                int tireAge = Integer.parseInt(input[index + 1]);
                tires[counter++] = new Tire(tirePressure, tireAge);
            }
            Car car = new Car(model, engine, cargo, tires);
            cars.putIfAbsent(model, car);
        }
        String fragileOrFlammable = scanner.nextLine();
        if (fragileOrFlammable.equals("flamable")) {
            cars.entrySet().stream().filter(car -> car.getValue().
                    getEngine().getEnginePower() > 250)
                    .forEach(e -> System.out.println(e.getValue().getModel()));
        } else if (fragileOrFlammable.equals("fragile")){
            cars.entrySet().stream().filter(car -> car.getValue().getCargo()
                    .getType().equals("fragile") && car.getValue().isCorrectPressure())
                    .forEach(e -> System.out.println(e.getValue().getModel()));
        }
    }
}
