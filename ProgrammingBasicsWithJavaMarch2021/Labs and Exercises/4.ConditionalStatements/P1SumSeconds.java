package day4ConditionalStatements;

import java.util.Scanner;

public class P1SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.next());
        int secondTime = Integer.parseInt(scanner.next());
        int thirtdTime = Integer.parseInt(scanner.next());

        int totalTime = firstTime + secondTime + thirtdTime;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }


    }
}
