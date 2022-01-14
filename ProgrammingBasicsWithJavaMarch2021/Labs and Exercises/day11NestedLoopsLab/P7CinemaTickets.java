package day11NestedLoopsLab;

import java.util.Scanner;

public class P7CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double moviePercentage = 0;
        double studentPercentage = 0;
        double standardPercentage = 0;
        double kidPercentage = 0;
        int sumTickets = 0;
        while (!command.equals("Finish")) {
            String movieName = command;

            int leftTickets = Integer.parseInt(scanner.nextLine());
            int countTickets = 0;
            for (int i = leftTickets; 0 < i; i--) {
                String ticketType = scanner.nextLine();

                if (ticketType.equals("End")) {
                    break;
                } else if (ticketType.equals("student")) {
                    studentPercentage++;
                } else if (ticketType.equals("standard")) {
                    standardPercentage++;
                } else if (ticketType.equals("kid")) {
                    kidPercentage++;
                }
                countTickets++;

                moviePercentage = 100.0 * countTickets / leftTickets;

            }
            sumTickets += countTickets;
            System.out.printf("%s - %.2f%% full.\n", movieName, moviePercentage);

            command = scanner.nextLine();
        }
        studentPercentage = studentPercentage / sumTickets * 100;
        standardPercentage = standardPercentage / sumTickets * 100;
        kidPercentage = kidPercentage / sumTickets * 100;
        System.out.printf("Total tickets: %d\n", sumTickets);
        System.out.printf("%.2f%% student tickets.\n" +
                "%.2f%% standard tickets.\n" +
                "%.2f%% kids tickets.\n", studentPercentage, standardPercentage, kidPercentage);
    }
}
