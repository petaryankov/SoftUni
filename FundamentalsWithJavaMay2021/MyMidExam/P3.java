package day13MyMidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P3Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        String[] commands = scanner.nextLine().split("\\s+");
        while (!commands[0].equals("end")) {
            String command = commands[0];
            if (command.equals("Chat")) {
                list.add(commands[1]);
            } else if (command.equals("Delete")) {
                list.remove(commands[1]);
            } else if (command.equals("Edit")) {
                if (list.contains(commands[1])) {
                    list.set(list.indexOf(commands[1]), commands[2]);
                }
            } else if (command.equals("Pin")) {
                if (list.contains(commands[1])) {
                    list.remove(commands[1]);
                    list.add(commands[1]);
                }
            } else if (command.equals("Spam")) {
                list.addAll(Arrays.asList(commands).subList(1, commands.length));
            }

            commands = scanner.nextLine().split("\\s+");
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
