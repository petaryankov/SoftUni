package day4DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P5PrintPartOfASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        for (int symbol = start; symbol <= stop; symbol++) {
            System.out.printf("%c ",symbol);
        }
    }
}
