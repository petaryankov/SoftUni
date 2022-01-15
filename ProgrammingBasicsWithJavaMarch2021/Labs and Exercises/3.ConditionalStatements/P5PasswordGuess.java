package day3ConditionalStatements;

import java.util.Scanner;

public class P5PasswordGuess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();
        String password = "s3cr3t!P@ssw0rd";
        if (inputPassword.equals(password)) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
