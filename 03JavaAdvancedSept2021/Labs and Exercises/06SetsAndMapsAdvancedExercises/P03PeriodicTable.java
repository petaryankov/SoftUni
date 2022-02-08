package day6.SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P3PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> chemicals = new TreeSet<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            chemicals.addAll(Arrays.asList(input));
        }
        chemicals.forEach(e -> System.out.print(e + " "));
    }
}
