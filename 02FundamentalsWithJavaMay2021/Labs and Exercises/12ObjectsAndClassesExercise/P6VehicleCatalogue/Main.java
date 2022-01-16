package day12ObjectsAndClassesExercise.P6VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //{typeOfVehicle} {model} {color} {horsepower}
        String[] input = scanner.nextLine().split("\\s+");
        List<Vehicle> vehicles = new ArrayList<>();
        while (!input[0].equals("End")) {
            String currentTypeOfVehicle = input[0];
            if (input[0].equals("truck")) {
                currentTypeOfVehicle = "Truck";
            } else if (input[0].equals("car")) {
                currentTypeOfVehicle = "Car";
            }
            Vehicle vehicle =
                    new Vehicle(currentTypeOfVehicle, input[1], input[2]
                            , Integer.parseInt(input[3]));
            vehicles.add(vehicle);
            input = scanner.nextLine().split("\\s+");
        }
        String model = scanner.nextLine();

        double carPowerAverage = countCarsHorsePower(vehicles);
        double truckPowerAverage = countTruckHorsePower(vehicles);

        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {

                if (vehicle.getModelOfVehicle().equals(model)) {
                    System.out.println("Type: " + vehicle.getTypeOfVehicle());
                    System.out.println("Model: " + vehicle.getModelOfVehicle());
                    System.out.println("Color: " + vehicle.getColorOfVehicle());
                    System.out.println("Horsepower: " + vehicle.getHorsepowerOfVehicle());
                }
            }
            model = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n", carPowerAverage);
        System.out.printf("Trucks have average horsepower of: %.2f.", truckPowerAverage);

    }

    private static double countTruckHorsePower(List<Vehicle> vehicles) {
        int truckHorsePowerSum = 0;
        int truckCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfVehicle().equals("Truck")) {
                truckHorsePowerSum += vehicle.getHorsepowerOfVehicle();
                truckCounter++;
            }
        }
        if (truckCounter != 0) {
            return 1.0 * truckHorsePowerSum / truckCounter;
        } else {
            return 0;
        }
    }

    private static double countCarsHorsePower(List<Vehicle> vehicles) {
        int carHorsePowerSum = 0;
        int carCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfVehicle().equals("Car")) {
                carHorsePowerSum += vehicle.getHorsepowerOfVehicle();
                carCounter++;
            }
        }
        if (carCounter != 0) {
            return 1.0 * carHorsePowerSum / carCounter;
        } else {
            return 0;
        }
    }

}
