package day10.PolymorphismExercises.P2.VehiclesExtension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInput[1])
                , Double.parseDouble(carInput[2]), Double.parseDouble(carInput[3]));

        String[] truckInput = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckInput[1])
                , Double.parseDouble(truckInput[2]), Double.parseDouble(truckInput[3]));

        String[] busInput = scanner.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(busInput[1])
                , Double.parseDouble(busInput[2]), Double.parseDouble(busInput[3]));
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "Drive":
                    String driveVehicle = command[1];
                    double distance = Double.parseDouble(command[2]);
                    if (driveVehicle.equals("Car")) {
                        System.out.println(car.drive(distance));
                    } else if (driveVehicle.equals("Truck")){
                        System.out.println(truck.drive(distance));
                    } else if (driveVehicle.equals("Bus")) {
                        System.out.println(bus.drive(distance));
                    }
                    break;
                case "Refuel":
                    String refuelVehicle = command[1];
                    double liters = Double.parseDouble(command[2]);
                    if (refuelVehicle.equals("Car")) {
                        car.refuel(liters);
                    } else if (refuelVehicle.equals("Truck")){
                        truck.refuel(liters);
                    } else if (refuelVehicle.equals("Bus")) {
                        bus.refuel(liters);
                    }
                    break;
                case "DriveEmpty":
                    double busDistance = Double.parseDouble(command[2]);
                    System.out.println(bus.driveEmpty(busDistance));
                    break;
            }
        }

        DecimalFormat df = new DecimalFormat("##.##");
        System.out.printf("Car: %.2f\n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f\n", bus.getFuelQuantity());
    }
}
