package day16TextProcessingLab;

import java.util.Scanner;

public class P2RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        StringBuilder result = new StringBuilder();
        for (String s : input) {
            for (int i = 0; i < s.length(); i++) {
            result.append(s);
            }
        }
        System.out.println(result);
    }
}
