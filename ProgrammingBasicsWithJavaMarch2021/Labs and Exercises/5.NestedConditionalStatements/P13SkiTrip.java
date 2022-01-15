package day5NestedConditionalStatements;

import java.util.Scanner;

public class P13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDays = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String feedback = scanner.nextLine();
        double result = 0;
        double overnight = numOfDays - 1;

        if (typeOfRoom.equals("room for one person")) {

            result = overnight * 18.0;

        } else if (typeOfRoom.equals("apartment")) {
            if (numOfDays < 10) {
                result = (overnight * 25.0) * 0.7;
            } else if (numOfDays <= 15) {
                result = (overnight * 25.0) * 0.65;
            } else if (numOfDays > 15) {
                result = (overnight * 25.0) * 0.5;
            }

        } else if (typeOfRoom.equals("president apartment")) {
            if (numOfDays < 10) {
                result = (overnight * 35.0) * 0.9;
            } else if (numOfDays <= 15) {
                result = (overnight * 35.0) * 0.85;
            } else if (numOfDays > 15) {
                result = (overnight * 35.0) * 0.8;
            }
        }
        if (feedback.equals("positive")) {
            result *= 1.25;
        } else if (feedback.equals("negative")) {
            result *= 0.90;
        }
        System.out.printf("%.2f", result);

    }
}

