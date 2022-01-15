package day4ConditionalStatements;

import java.util.Scanner;

public class P7WorldSwimmingRecord {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double meterTime = Double.parseDouble(scanner.nextLine());

        double ivansTime = meters * meterTime;
        double delay = 0;

        if (meters >= 15) {
            delay = Math.floor(meters / 15) * 12.5;
            ivansTime += delay;
        }
        if (ivansTime >= recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (ivansTime - recordInSeconds));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivansTime);
        }
    }
}
