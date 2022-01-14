package day11NestedLoopsLab;

import java.util.Scanner;

public class P3Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //x1 + x2 + x3 = n
        int result = 0;
        int counter = 0;
        int n = Integer.parseInt(scanner.nextLine());

        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                    result = x1 + x2 + x3;
                    if (result == n) {
                        counter++;
                    }
                }

            }

        }
        System.out.println(counter);
    }
}
