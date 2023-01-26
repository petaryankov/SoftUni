package day8.InterfacesAndAbstractionExercises.P5.Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        List<String> numbersList = Arrays.stream(numbers).collect(Collectors.toList());
        String[] urls = scanner.nextLine().split("\\s+");
        List<String> urlsList = Arrays.stream(urls).collect(Collectors.toList());
        Smartphone smartphone = new Smartphone(numbersList, urlsList);
        System.out.println(smartphone.call().trim());
        System.out.println(smartphone.browse());
    }
}
