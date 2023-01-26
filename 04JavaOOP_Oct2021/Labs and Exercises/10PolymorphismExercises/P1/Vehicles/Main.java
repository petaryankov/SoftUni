package day10.PolymorphismExercises.P1.Vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInput[1])
                , Double.parseDouble(carInput[2]));

        String[] truckInput = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckInput[1])
                , Double.parseDouble(truckInput[2]));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "Drive":
                    String driveVehicle = command[1];
                    double distance = Double.parseDouble(command[2]);
                    if (driveVehicle.equals("Car")) {
                        System.out.println(car.drive(distance));
                    } else {
                        System.out.println(truck.drive(distance));
                    }
                    break;
                case "Refuel":
                    String refuelVehicle = command[1];
                    double liters = Double.parseDouble(command[2]);
                    if (refuelVehicle.equals("Car")) {
                        car.refuel(liters);
                    } else {
                        truck.refuel(liters);
                    }
                    break;
            }
        }

        DecimalFormat df = new DecimalFormat("##.##");
        System.out.printf("Car: %.2f\n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n", truck.getFuelQuantity());
    }
}
