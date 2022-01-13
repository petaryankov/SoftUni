package day1BasicSyntaxCondStatementsAndLoopsLab;

import java.util.Scanner;

public class P6ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String countryName = scanner.nextLine();

        if (countryName.equals("USA") || countryName.equals("England")) {
            System.out.println("English");
        } else if (countryName.equals("Spain")
                || countryName.equals("Argentina")
                || countryName.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
