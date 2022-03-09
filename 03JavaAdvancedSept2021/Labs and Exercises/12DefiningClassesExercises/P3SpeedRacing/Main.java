package day12.DefiningClassesExercises.P3SpeedRacing;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();

        while (line-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelCostFor1km = Double.parseDouble(data[2]);
            Car car = new Car(model, fuelAmount, fuelCostFor1km);
            cars.put(model, car);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String carModel = command.split("\\s+")[1];
            int distance = Integer.parseInt(command.split("\\s+")[2]);
            if (cars.containsKey(carModel)) {
                cars.get(carModel).calculateFuel(distance);
            }

            command = scanner.nextLine();
        }
        cars.values().forEach(System.out::println);
    }
}
