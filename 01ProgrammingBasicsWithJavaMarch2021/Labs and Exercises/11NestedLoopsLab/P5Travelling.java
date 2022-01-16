package day11NestedLoopsLab;

import java.util.Scanner;

public class P5Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        //break when destination = "End"
        while (!destination.equals("End")) {

            double destinationBudget = Double.parseDouble(scanner.nextLine());
            double savings = Double.parseDouble(scanner.nextLine());

            // break when savings >= destinationBudget
            while (savings < destinationBudget) {
                savings += Double.parseDouble(scanner.nextLine());
            }//print when savings >= destinationBudget
            System.out.printf("Going to %s!\n", destination);
            // destination or End
            destination = scanner.nextLine();
        }
    }
}