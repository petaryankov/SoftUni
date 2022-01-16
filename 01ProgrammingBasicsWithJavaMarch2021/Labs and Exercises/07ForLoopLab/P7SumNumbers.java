package day7ForLoopLab;

import java.util.Scanner;

public class P7SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfInput = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= numOfInput; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
        }
        System.out.println(sum);
    }
}
