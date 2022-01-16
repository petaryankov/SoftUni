package day11NestedLoopsLab;

import java.util.Scanner;

public class P6Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfFlores = Integer.parseInt(scanner.nextLine());
        int numOfRooms = Integer.parseInt(scanner.nextLine());
        String symbol = "";

        for (int flores = numOfFlores; flores >= 1 ; flores--) {
            for (int rooms = 0; rooms < numOfRooms ; rooms++) {

                if (numOfFlores == flores) {
                    symbol = "L";
                } else if (flores % 2 != 0) {
                    symbol = "A";
                } else {
                    symbol = "O";
                }
                System.out.printf("%s%d%d ", symbol, flores, rooms);
            }
            System.out.println();
        }

    }
}
