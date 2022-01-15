package day6ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().
                split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            for (int i = index + 1; i <= numbers.length - 1; i++) {

                if (numbers[index] + numbers[i] == magicSum) {
                    System.out.printf("%d %d\n", numbers[index], numbers[i]);
                }
            }
        }
    }
}
