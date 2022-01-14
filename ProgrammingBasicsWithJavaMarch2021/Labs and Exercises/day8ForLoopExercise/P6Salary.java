package day8ForLoopExercise;

import java.util.Scanner;

public class P6Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int wage = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("Facebook")) {
                wage -= 150;
            } else if (input.equals("Instagram")) {
                wage -= 100;
            } else if (input.equals("Reddit")) {
                wage -= 50;
            }
            if (wage <= 0) {
                break;
            }

        }
        if (wage <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(wage);
        }
    }
}
