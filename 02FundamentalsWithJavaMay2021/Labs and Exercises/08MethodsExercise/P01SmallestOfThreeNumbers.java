package day8MethodsExercise;

import java.util.Scanner;

public class P1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        getSmallestNum(a, b, c);

    }

    private static void getSmallestNum(int a, int b, int c) {
        int[] arr = {a, b, c};
        int minNum = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < minNum ) {
                minNum = i;
            }
        }
        System.out.println(minNum);
    }
}
