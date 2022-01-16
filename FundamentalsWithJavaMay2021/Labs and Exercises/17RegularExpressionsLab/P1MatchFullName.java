package day18RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1MatchFullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String listOfNames = scanner.nextLine();
        String regex = "(?<firstName>\\b[A-Z][a-z]+) (?<lastName>[A-Z][a-z]+\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(listOfNames);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
