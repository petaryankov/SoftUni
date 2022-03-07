package day11.DefiningClassesLab.P01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String input = scanner.nextLine();
            String carBrand = input.split("\\s+")[0];
            String carModel = input.split("\\s+")[1];
            int carHp = Integer.parseInt(input.split("\\s+")[2]);
            Car car = new Car(carBrand, carModel, carHp);

            System.out.printf("The car is: %s %s - %d HP.\n",
                    car.getBrand(), car.getModel(), car.getHorsePower());
        }

    }
}
