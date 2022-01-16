package day5ArraysLab;

import java.util.Scanner;

public class P2PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = Integer.parseInt(scanner.nextLine());
        int[] array = new int[arraySize];

        for (int index = 0; index < arraySize; index++) {
             array[index] = Integer.parseInt(scanner.nextLine());
        }// reverse print
        for (int reverse = array.length - 1; reverse >= 0; reverse--) {
            System.out.printf("%d ", array[reverse]);
        }
    }
}
