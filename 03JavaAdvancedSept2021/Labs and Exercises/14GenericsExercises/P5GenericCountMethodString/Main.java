package day16.GenericsExercises.P5.GenericCountMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();

        while (lines-- > 0) {
            String element = scanner.nextLine();
            box.add(element);
        }
        String toCompare = scanner.nextLine();
        System.out.println(box.countOfGreaterItems(toCompare));

    }
}
