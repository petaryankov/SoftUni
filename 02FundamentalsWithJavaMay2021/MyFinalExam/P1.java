package day20MyFinalExam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder email = new StringBuilder(scanner.nextLine());

        String commands = scanner.nextLine();

        while (!commands.equals("Complete")) {
            String command = commands.split(" ")[0];
            switch (command) {
                case "Make":
                    String upperOrLower = commands.split(" ")[1];
                    if (upperOrLower.equals("Upper")) {
                        email = new StringBuilder(email.toString().toUpperCase());
                        System.out.println(email);
                    } else {
                        email = new StringBuilder(email.toString().toLowerCase());
                        System.out.println(email);
                    }
                    break;
                case "GetDomain":
                    int lastCount = Integer.parseInt(commands.split(" ")[1]);
                    //gosho
                    if (lastCount >= 0 && lastCount < email.length()) {
                        String domain = email.toString()
                                .substring(email.length() - lastCount);
                        System.out.println(domain);
                    }
                    break;
                case "GetUsername":
                    if (email.toString().contains("@")) {
                        int endIndex = email.indexOf("@");
                        String username = email.toString().substring(0, endIndex);
                        System.out.println(username);
                    } else {
                        System.out.printf("The email %s doesn't contain the @ symbol.\n", email);
                    }
                    break;
                case "Replace":
                    String toReplace = commands.split(" ")[1];
                    String replaceWith = "-";
                    email = new StringBuilder(email.toString().replaceAll(toReplace, replaceWith));
                    System.out.println(email);
                    break;
                case "Encrypt":
                    for (int i = 0; i < email.length(); i++) {
                        System.out.printf("%d ",(int)(email.charAt(i)));
                    }
                    System.out.println();
                    break;
            }
            commands = scanner.nextLine();
        }
    }
}
