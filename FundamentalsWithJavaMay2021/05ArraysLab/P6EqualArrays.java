package day5ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P6EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNum = Arrays.stream(scanner.nextLine().
                split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondNum = Arrays.stream(scanner.nextLine().
                split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isIdentical = false;
        for (int index = 0; index < firstNum.length; index++) {
            if (firstNum[index] != secondNum[index]) {
                System.out.printf("Arrays are not identical." +
                        " Found difference at %d index.", index);
                isIdentical = false;
                break;
            } else {
                sum += firstNum[index];
                isIdentical = true;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
