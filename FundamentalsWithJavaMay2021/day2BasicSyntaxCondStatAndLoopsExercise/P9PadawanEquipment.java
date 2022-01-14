package day2BasicSyntaxCondStatAndLoopsExercise;

import java.util.Scanner;

public class P9PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersSum = Math.ceil(students * 1.1) * lightsabersPrice;
        double robesSum = robesPrice * students;
        int freeBelt = students / 6;
        double beltsSum = beltsPrice * (students - freeBelt);
        double expenses = lightsabersSum + robesSum + beltsSum;

        if (budget >= expenses) {
            System.out.printf("The money is enough - it would cost %.2flv.", expenses);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", expenses - budget);
        }
    }
}
