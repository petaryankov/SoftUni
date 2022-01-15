package day6ArraysExercises;

import java.util.Scanner;

public class P2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String second : secondArray) {
            for (String first : firstArray) {
                if (first.equals(second)) {
                    System.out.printf("%s ", first);
                }
            }
        }
    }
}
