package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P3Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = 1.0 * numOfPeople / capacity;

        System.out.printf("%.0f",Math.ceil(courses));
    }
}
