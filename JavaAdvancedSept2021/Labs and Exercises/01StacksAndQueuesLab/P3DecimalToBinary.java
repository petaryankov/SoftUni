package day1.StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P3DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        while (number != 0) {
            int decimal = number % 2;
            binary.push(decimal);
            number /= 2;
        }
        if (binary.isEmpty()) {
            System.out.println(0);
        }
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
