package day3DataTypesAndVariablesLab;

import java.util.Scanner;

public class P6CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", symbol1, symbol2, symbol3);
    }
}
