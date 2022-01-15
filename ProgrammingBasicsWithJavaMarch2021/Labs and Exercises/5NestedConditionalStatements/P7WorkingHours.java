package day5NestedConditionalStatements;

import java.util.Scanner;

public class P7WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String weekDay = scanner.nextLine();

        switch (weekDay) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hours >= 10 && hours <= 18) {
                    System.out.println("open");
                } else
                    System.out.println("closed");
                break;
            case "Sunday":
                System.out.println("closed");
                break;
        }
    }
}
