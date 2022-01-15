package day10ListsExercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> listNames = new ArrayList<>();

        for (int line = 1; line <= numOfCommands; line++) {
            String[] commands = scanner.nextLine().split(" ");
            //-	"{name} is going!"
            String name = commands[0];
            if (commands[2].equals("going!")) {
                if (listNames.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    listNames.add(name);
                }
                //-	"{name} is not going!"
            } else if (commands[2].equals("not")) {
                if (!listNames.contains(name)) {
                    System.out.println(name + " is not in the list!");
                } else {
                    listNames.remove(name);
                }
            }
        }
        for (String listName : listNames) {
            System.out.println(listName);
        }
    }
}
