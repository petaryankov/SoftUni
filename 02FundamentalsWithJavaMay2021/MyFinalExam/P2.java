package day20MyFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(U\\$)(?<username>[A-Z][a-z]{2,})\\1P@" +
                "\\$(?<password>[A-Za-z]{5,}[0-9]+)P@\\$";

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int line = 1; line <= n; line++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                counter++;
                String username = matcher.group("username");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s\n", username, password);
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + counter);
    }
}
