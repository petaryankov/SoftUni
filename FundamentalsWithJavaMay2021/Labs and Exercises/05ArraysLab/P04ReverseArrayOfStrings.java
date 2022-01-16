package day5ArraysLab;

import java.util.Scanner;

public class P4ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for (int index = 0; index < array.length / 2; index++) {
            String oldArray = array[index];
            array[index] = array[(array.length-1) - index];
            array[(array.length-1) - index] = oldArray;
        }
        System.out.println(String.join(" ", array));
    }
}
