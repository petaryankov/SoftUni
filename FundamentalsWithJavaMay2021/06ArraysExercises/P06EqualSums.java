package day6ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isIndex = false;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int indexLeft = 0; indexLeft <= index-1; indexLeft++) {
                sumLeft += numbers[indexLeft];
            }
            for (int indexRight = index + 1; indexRight <= numbers.length-1 ; indexRight++) {
                sumRight += numbers[indexRight];
            }
            if (sumLeft == sumRight) {
                System.out.println(index);
                isIndex = true;
                break;
            }
        }
        if (!isIndex) {
            System.out.println("no");
        }
    }
}
