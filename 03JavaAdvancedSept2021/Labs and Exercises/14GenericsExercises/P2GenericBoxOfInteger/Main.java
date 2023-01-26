package day16.GenericsExercises.P2.GenericBoxOfInteger;

import day16.GenericsExercises.P1.GenericBox.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box();

        while (lines-- > 0) {
            int input = Integer.parseInt(scanner.nextLine());
            box.add(input);
        }
        System.out.println(box);
    }
}
