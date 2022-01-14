package Exams.MyExam;

import java.util.Scanner;

public class P3SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първи ред – дни за престой – цяло число в интервала [0...365]
        //•	Втори ред –  вид помещение –  "room for one person",  "apartment" или "president apartment"
        //•	Трети ред –  оценка - "positive"  или "negative"

        int stayDays = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        double price = 0;
        int nights = stayDays-1;
        if (roomType.equals("room for one person")) {
                price += nights * 18;
        } else if (roomType.equals("apartment")) {
            if (nights < 10) {
                price += nights * 25 * 0.70;
            } else if (stayDays < 15) {
                price += nights * 25 * 0.65;
            } else {
                price += nights * 25 * 0.50;
            }
        } else {
            if (nights < 10) {
                price += nights * 35 * 0.90;
            } else if (stayDays < 15) {
                price += nights * 35 * 0.85;
            } else {
                price += nights * 35 * 0.80;
            }
        }
        if (feedback.equals("positive")) {
            price *= 1.25;
        } else {
            price *= 0.90;
        }
        System.out.printf("%.2f", price);
    }
}
