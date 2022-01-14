package Exams.MyExam;

import java.util.Scanner;

public class P1Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.	Броят на хората в групата – цяло число в интервала [0 … 50]
        //2.	Броят на нощувките – цяло число в интервала [0 … 2000]
        //3.	Броят на картите за транспорт – цяло число в интервала [0… 2000]
        //4.	Броят на билетите за музеи – цяло число в интервала [0 … 2000]
        int numPeople = Integer.parseInt(scanner.nextLine());
        int numNights = Integer.parseInt(scanner.nextLine());
        int numCards = Integer.parseInt(scanner.nextLine());
        int numTickets = Integer.parseInt(scanner.nextLine());

        double nightsCoast = numNights * 20;
        double cardsCoast = numCards * 1.60;
        double ticketsCoast = numTickets * 6;
        double sum = (nightsCoast + cardsCoast + ticketsCoast) * numPeople * 1.25;

        System.out.printf("%.2f", sum);
    }
}
