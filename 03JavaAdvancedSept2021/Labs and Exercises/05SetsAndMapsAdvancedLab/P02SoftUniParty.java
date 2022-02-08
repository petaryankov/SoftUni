package day5.SetsAndMapsAdvancedLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P2SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> list = new TreeSet<>();

        while (!input.equals("PARTY")) {
            list.add(input);

            input = scanner.nextLine();
        }
        String guests = scanner.nextLine();
        while (!guests.equals("END")) {
            list.remove(guests);
            guests = scanner.nextLine();
        }

        System.out.println(list.size());
        System.out.println(String.join(System.lineSeparator(), list));
    }
}
