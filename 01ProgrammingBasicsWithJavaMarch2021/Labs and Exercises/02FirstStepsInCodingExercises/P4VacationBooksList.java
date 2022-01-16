package day2FirstStepsInCodingExercise;

import java.util.Scanner;

public class P4VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numOfDays = Integer.parseInt(scanner.nextLine());

        //calculation
        int hoursForBook = bookPages / pagesPerHour;
        int hoursPerDay = hoursForBook / numOfDays;
        System.out.println(hoursPerDay);


    }
}
