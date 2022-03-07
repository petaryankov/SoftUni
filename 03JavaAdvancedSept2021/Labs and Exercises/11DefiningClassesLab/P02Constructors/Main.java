package day11.DefiningClassesLab.Constructors02;

import day11.DefiningClassesLab.CarInfo01.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        Car car;
        while (n-- > 0) {
            String[] carData = scanner.nextLine().split("\\s+");
            if (carData.length > 1) {
                car = new Car(carData[0], carData[1]
                        , Integer.parseInt(carData[2]));
            } else {
                car = new Car(carData[0]);
            }
            cars.add(car);
        }
        cars.forEach(e -> System.out.println(e.toString()));

    }
}
