package day12NestedLoopsExercise;

import java.util.Scanner;

public class P6SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1111; i <= 9999; i++) {
            int currentNum = i;
            int counter = 0;
            for (int j = 4; j >= 1; j--) {
                //read last digit
                int digit = currentNum % 10;
                //check if digit isTrue
                if (digit == 0) {
                    continue;
                }
                //don't read if digit is 0
                if (n % digit == 0) {
                    counter++;
                }
                // removing last digit
                currentNum /= 10;
                //check if all digits are true and print
                if (counter == 4) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
