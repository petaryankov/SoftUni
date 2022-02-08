package day6.SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P2SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        while (firstNum-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        while (secondNum-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        firstSet.retainAll(secondSet);
        firstSet.forEach(e -> System.out.printf("%d ", e));
    }
}
