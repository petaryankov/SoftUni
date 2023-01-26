package ExamsPreparation.Exam20February2021.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public List<Car> data;
    public String name;
    public int capacity;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void add(Car car) {
        if (data.size() < capacity) {
            data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer)
                    && car.getModel().equals(model)) {
                data.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        int maxYear = 0;
        for (Car car : data) {
            if (car.getYear() > maxYear) {
                maxYear = car.getYear();
            }
        }
        for (Car car : data) {
            if (car.getYear() == maxYear) {
                return car;
            }
        }
        return null;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer)
                    && car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The cars are in a car Exam1Preparation.Exam20February2021.dealership %s:\n", name));
        data.forEach(car-> sb.append(car).append(System.lineSeparator()));
        return sb.toString();
    }
}
