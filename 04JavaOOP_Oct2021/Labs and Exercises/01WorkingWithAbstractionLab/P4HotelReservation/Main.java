package day1.WorkingWithAbstractionLab.P4.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numOfDays = Integer.parseInt(input[1]);
        String season = input[2];
        String discount = input[3];
        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay
                , numOfDays, Season.parseSeason(season), Discount.parseDiscount(discount));
        System.out.printf("%.2f\n", priceCalculator.getHolidayPrice());
    }
}
