package day6NestedConditionalStatements;

import java.util.Scanner;

public class P7HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред е месецът – May, June, July, August, September or October
        //•	На втория ред е броят на нощувките – цяло число [0 ... 200]
        String month = scanner.nextLine();
        int numOfNights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        //•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        //•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        switch (month) {
            case "May":
            case "October":
                studioPrice = numOfNights * 50;
                apartmentPrice = numOfNights * 65;
                if (numOfNights > 14) {
                    studioPrice *= 0.70;  // discount 30%
                    apartmentPrice *= 0.90;  // discount 10%
                } else if (numOfNights > 7) {
                    studioPrice *= 0.95; // discount 5%
                }
                break;
            case "June":
            case "September":
                studioPrice = numOfNights * 75.20;
                apartmentPrice = numOfNights * 68.70;
                if (numOfNights > 14) {
                    studioPrice *= 0.80; // discount 20%
                    apartmentPrice *= 0.90; // discount 10%
                }
                break;
            case "July":
            case "August":
                studioPrice = numOfNights * 76;
                apartmentPrice = numOfNights * 77;
                if (numOfNights > 14) {
                    apartmentPrice *= 0.90; // discount 10%
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartmentPrice, studioPrice);
    }
}
