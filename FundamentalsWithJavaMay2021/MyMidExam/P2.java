package day13MyMidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cookies = new ArrayList<>();
        String[] biscuits = scanner.nextLine().split(",");
        for (String biscuit : biscuits) {
            biscuit = biscuit.trim();
            cookies.add(biscuit);
        }
        String[] commands = scanner.nextLine().split(" ");
        while (!commands[0].equals("No")) {
            String command = commands[0];
            //OutOfStock
            if (command.equals("OutOfStock")) {
                String product = commands[1];
                if (cookies.contains(product))
                        for (int i = 0; i < cookies.size(); i++) {
                            if (cookies.get(i).equals(product)) {
                                cookies.set(i, "None");
                            }
                        }
                //cookies.removeIf(cookie -> cookie.equals(product));
                //Required
            } else if (command.equals("Required")) {
                int index = Integer.parseInt(commands[2]);
                String exchange = commands[1];
                if (index >= 0 && index < cookies.size() && !cookies.get(index).equals(exchange)
                        && !cookies.get(index).equals("None")) {
                    cookies.remove(index);
                    cookies.add(index, exchange);
                }
            } else if (command.equals("Last")) {
                cookies.add(commands[1]);
            }
            commands = scanner.nextLine().split(" ");
        }
        for (String cookie : cookies) {
            if (!cookie.equals("None")) {
                System.out.print(cookie + " ");
            }
        }
        System.out.println();
    }
}
