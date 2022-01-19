package day5.SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P1ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parkingLot = new LinkedHashSet<>();
        while (!input.equals("END")) {
            String[] data = input.split(", ");
            String inOut = data[0];
            String carPlate = data[1];
            if (inOut.equals("IN")) {
                parkingLot.add(carPlate);
            } else {
                parkingLot.remove(carPlate);
            }
            input = scanner.nextLine();
        }
        String output = parkingLot.isEmpty() ? "Parking Lot is Empty" :
        parkingLot.stream().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(output);

    }
}
