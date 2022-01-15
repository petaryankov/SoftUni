package day1FirstStepsInCodingLab;

import java.util.Scanner;

public class P5GreetingByName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
