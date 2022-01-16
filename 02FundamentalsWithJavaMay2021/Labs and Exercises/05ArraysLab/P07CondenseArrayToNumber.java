package day5ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        while (numbers.length > 1) {

            int[] condensed = new int[numbers.length - 1];
            for (int index = 0; index < condensed.length; index++) {
                condensed[index] = numbers[index] + numbers[index + 1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}
