package day18RegularExpressionsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2MatchPhoneNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String phones = scanner.nextLine();
        String regex = "\\+359(?<separator>[- ])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phones);
        List<String> matchedPhones = new ArrayList<>();
        while (matcher.find()) {
            matchedPhones.add(matcher.group());
        }
            System.out.print(String.join(", ", matchedPhones));
    }
}
