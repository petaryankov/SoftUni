package day3DataTypesAndVariablesLab;

import java.util.Scanner;

public class P5ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String symbol = scanner.nextLine();

        System.out.print(name1+symbol+name2);
    }
}
