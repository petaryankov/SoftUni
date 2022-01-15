package day7ForLoopLab;

import java.util.Scanner;

public class P4EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int indexOfN = 1;

        for (int i = 0; i <= n; i += 2) {

            System.out.println(indexOfN);
            indexOfN *= indexOfN * 2 * 2;

        }

    }
}
