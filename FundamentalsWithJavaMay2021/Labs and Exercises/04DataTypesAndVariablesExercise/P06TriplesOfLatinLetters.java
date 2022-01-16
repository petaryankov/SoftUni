package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P6TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int end = 'a'+ input;

        for (int symbol1 = 'a'; symbol1 < end; symbol1++) {
            for (int symbol2 = 'a'; symbol2 < end; symbol2++) {
                for (int symbol3 = 'a'; symbol3 < end; symbol3++) {
                    System.out.printf("%c%c%c\n", symbol1, symbol2, symbol3);
                }
            }
        }
    }
}
