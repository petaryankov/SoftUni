package day5ArraysLab;

import java.util.Scanner;

public class P1DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysName = {"Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int daysNum = Integer.parseInt(scanner.nextLine());
        if (daysNum > 0 && daysNum <= daysName.length) {
            System.out.printf("%s", daysName[daysNum-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
