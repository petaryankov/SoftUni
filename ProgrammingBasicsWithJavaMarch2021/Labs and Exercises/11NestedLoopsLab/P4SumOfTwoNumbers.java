package day11NestedLoopsLab;

import java.util.Scanner;

public class P4SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isMagic = false;
        int result;
        for (int i = num1; i <= num2; i++) {

            for (int j = num1; j <= num2; j++) {
                count++;
                result = i + j;
                if (result == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNum);
                    isMagic = true;
                    break;
                }
            }
            if (isMagic) {
                break;
            }
        }
        if (!isMagic) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}