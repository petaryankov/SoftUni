package day6ArraysExercises;

import java.util.Scanner;

public class P7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int counter = 1;
        int counterMax = 0;
        String equalElement = "2 1 1 2 3 3 2 2 2 1";
        for (int index = 0; index <= numbers.length - 2; index++) {

            if (numbers[index].equals(numbers[index + 1])) {
                counter++;
                if (counterMax < counter) {
                    counterMax = counter;
                    equalElement = numbers[index];
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 1; i <= counterMax; i++) {
            System.out.print((equalElement + " "));
        }
    }
}
