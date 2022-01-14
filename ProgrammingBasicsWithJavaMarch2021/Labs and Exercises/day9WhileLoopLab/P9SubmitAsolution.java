package day9WhileLoopLab;

import java.util.Scanner;

public class P9SubmitAsolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int hSpace = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int sumBox = 0;
        int freeSpace = widthSpace * lengthSpace * hSpace;
        while (!input.equals("Done")) {

            int numBox = Integer.parseInt(input);
            sumBox += numBox;
            if (sumBox > freeSpace) {
                break;
            }
            input = scanner.nextLine();
        }
        if (freeSpace < sumBox) {
            System.out.printf("No more free space! You need %d Cubic meters more.", sumBox - freeSpace);
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace - sumBox);

        }
    }
}
