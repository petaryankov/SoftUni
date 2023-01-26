package day18.IteratorsAndComparatorsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListyIterator listyIterator = null;
        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] commands = line.split("\\s+");
            String command = commands[0];
            switch (command) {
                case "Create":
                    if (commands.length > 1) {
                        listyIterator = new ListyIterator(Arrays
                                .copyOfRange(commands, 1, commands.length));
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    };
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }
            line = scanner.nextLine();
        }
    }
}
