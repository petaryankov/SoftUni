package day1FirstStepsInCodingLab;

import java.util.Scanner;

public class P8PetShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());
        double dogsFood = dogs * 2.5;
        double otherAnimalsFood = otherAnimals * 4;
        System.out.println(dogsFood + otherAnimalsFood + " lv.");
    }
}
