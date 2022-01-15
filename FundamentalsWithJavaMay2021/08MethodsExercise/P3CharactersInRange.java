package day8MethodsExercise;

import java.util.Scanner;

public class P3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printCharactersInRange(firstChar, secondChar);
    }
    public static void printCharactersInRange(char ch1, char ch2)  {
        char startSymbol = ch1;
        char endSymbol = ch2;
        if (ch1 > ch2) {
            startSymbol = ch2;
            endSymbol = ch1;
        }
        for (int start = startSymbol + 1; start < endSymbol; start++) {
            System.out.printf("%c ",start);
        }
        System.out.println();
    }
}
