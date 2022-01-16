package day12ObjectsAndClassesExercise.P2Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];
        Articles articles = new Articles(title, content, author);
        int numOfCommands = Integer.parseInt(scanner.nextLine());
        for (int line = 1; line <= numOfCommands; line++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]) {
                case "Edit":
                   articles.setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    articles.setAuthor(command[1]);
                    break;
                case "Rename":
                    articles.setTitle(command[1]);
                    break;
            }
        }
        System.out.printf("%s - %s: %s", articles.getTitle()
        , articles.getContent(), articles.getAuthor());
    }
}
