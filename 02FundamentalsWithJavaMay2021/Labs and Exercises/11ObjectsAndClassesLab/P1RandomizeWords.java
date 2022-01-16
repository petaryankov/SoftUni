package day11ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class P1RandomizeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        Random randomNumbers = new Random();
        for (int index = 0; index < text.length; index++) {
            int myRandom = randomNumbers.nextInt(text.length);
            String currentString = text[index];
            text[index] = text[myRandom];
            text[myRandom] = currentString;
        }
        for (String s : text) {
            System.out.println(s);
        }
    }
}
