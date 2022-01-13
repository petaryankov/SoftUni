package day1BasicSyntaxCondStatementsAndLoopsLab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if (y <= 10) {
            for (int i = y; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", x, i, x * i);
            }
        } else {
            System.out.printf("%d X %d = %d", x, y, x * y);
        }
    }
}
