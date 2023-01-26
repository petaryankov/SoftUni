package day16.GenericsExercises.P1.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box();

        while (lines-- > 0) {
            String input = scanner.nextLine();
            box.add(input);
        }
        System.out.println(box);
    }
}
