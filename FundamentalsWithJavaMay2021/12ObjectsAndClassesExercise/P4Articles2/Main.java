package day12ObjectsAndClassesExercise.P4Articles2;

import day12ObjectsAndClassesExercise.P2Articles.Articles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Articles> articles = new ArrayList<>();

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        for (int line = 1; line <= numOfCommands; line++) {
            String[] inputData = scanner.nextLine().split(", ");
            String title = inputData[0];
            String content = inputData[1];
            String author = inputData[2];

            Articles articles1 = new Articles(title, content, author);
            articles.add(articles1);
        }
        String command = scanner.nextLine();
        if ("title".equals(command)) {
            articles.sort(Comparator.comparing(Articles::getTitle));
        } else if ("content".equals(command)) {
            articles.sort(Comparator.comparing(Articles::getContent));
        } else if ("author".equals(command)) {
            articles.sort(Comparator.comparing(Articles::getAuthor));
        }
        for (Articles article : articles) {
            System.out.printf("%s - %s: %s\n", article.getTitle()
                    , article.getContent(), article.getAuthor());
        }
    }
}

