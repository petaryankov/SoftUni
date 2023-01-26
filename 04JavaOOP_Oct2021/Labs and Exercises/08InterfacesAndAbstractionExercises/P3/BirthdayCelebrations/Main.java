package day8.InterfacesAndAbstractionExercises.P3.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthableList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            switch (type) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthDate = tokens[4];
                    Citizen citizen = new Citizen(name, age, id, birthDate);
                     birthableList.add(citizen);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petBirthDate = tokens[2];
                    Pet pet = new Pet(petName, petBirthDate);
                    birthableList.add(pet);
                    break;
            }
            input = scanner.nextLine();
        }
        String year = scanner.nextLine();
        int counter = 0;
        for (Birthable birthable : birthableList) {
            if (birthable.getBirthDate().endsWith(year)) {
                counter++;
                System.out.println(birthable.getBirthDate());
            }
        }
        if (counter == 0) {
            System.out.println("<no output>");
        }
    }
}
