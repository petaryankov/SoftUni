package day4ConditionalStatements;

import java.util.Scanner;

public class P5TimePlus15Minutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 15;
        if (minutes > 59) {
            hours ++;
            minutes %= 60;
        }
        if (hours > 23) {
            hours %= 24;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
