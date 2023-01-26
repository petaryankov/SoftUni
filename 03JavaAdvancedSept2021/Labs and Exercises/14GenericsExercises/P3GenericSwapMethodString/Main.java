package day16.GenericsExercises.P3.GenericSwapMethodString;

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
        String[] swapIndexes = scanner.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(swapIndexes[0]);
        int secondIndex = Integer.parseInt(swapIndexes[1]);
        box.swap(firstIndex, secondIndex);
        System.out.println(box);

    }
}
