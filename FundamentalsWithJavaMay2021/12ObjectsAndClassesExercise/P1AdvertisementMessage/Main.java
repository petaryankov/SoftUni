package day12ObjectsAndClassesExercise.P1AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfMessages = Integer.parseInt(scanner.nextLine());
        AdvertisementMessage message = new AdvertisementMessage();


        for (int i = 1; i <= numOfMessages; i++) {
            Random myRandom = new Random();
            String phrase = message.getPhrases()[myRandom.nextInt(message.getPhrases().length)];
            String event = message.getEvents()[myRandom.nextInt(message.getEvents().length)];
            String author = message.getAuthors()[myRandom.nextInt(message.getAuthors().length)];
            String city = message.getCities()[myRandom.nextInt(message.getCities().length)];

            System.out.printf("%s %s %s - %s\n", phrase, event, author, city);
        }
    }
}
