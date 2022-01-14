package day5NestedConditionalStatements;

import java.util.Scanner;

public class P8CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            System.out.println(12);
        }
        if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            System.out.println(14);
        }
        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            System.out.println(16);
        }
    }
}
