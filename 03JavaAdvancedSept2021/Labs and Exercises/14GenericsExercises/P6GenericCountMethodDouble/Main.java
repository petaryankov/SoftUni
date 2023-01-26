package day16.GenericsExercises.P6.GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();

        while (lines-- > 0) {
            double element = Double.parseDouble(scanner.nextLine());
            box.add(element);
        }
        double toCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(box.countOfGreaterItems(toCompare));
    }
}
