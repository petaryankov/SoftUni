package day6ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstLine = new String[n];
        String[] secondLine = new String[n];
        int counter = 0;
        for (int line = 1; line <= n; line++) {
            String[] numbers = (scanner.nextLine().split(" "));
                if (counter % 2 == 0) {
                    firstLine[counter] = numbers[0];
                    secondLine[counter] = numbers[1];
                } else {
                    firstLine[counter] = numbers[1];
                    secondLine[counter] = numbers[0];
                }
                    counter++;
            }
        System.out.println(String.join(" ",firstLine));
        System.out.println(String.join(" ",secondLine));
        }
    }
