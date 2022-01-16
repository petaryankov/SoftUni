package day17TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P5MultiplyBigNumberBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger inputNumber = new BigInteger(scanner.nextLine());
        int toMultiply = Integer.parseInt(scanner.nextLine());

        System.out.println(inputNumber.multiply(BigInteger.valueOf(toMultiply)));

    }
}
