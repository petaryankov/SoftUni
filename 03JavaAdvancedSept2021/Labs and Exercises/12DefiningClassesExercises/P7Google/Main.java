package day12.DefiningClassesExercises.P7Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            people.putIfAbsent(name, new Person(name));
            String command = tokens[1];
            switch (command) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(companyName, department, salary);
                    people.get(name).addCompany(company);

                    break;
                case "car":
                    Car car = new Car(tokens[2], Integer.parseInt(tokens[3]));
                    people.get(name).addCar(car);

                    break;
                case "parents":
                    Parent parent = new Parent(tokens[2], tokens[3]);
                    people.get(name).getParent().add(parent);

                    break;
                case "children":
                    Children children = new Children(tokens[2], tokens[3]);
                    people.get(name).getChildren().add(children);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(tokens[2], tokens[3]);
                    people.get(name).getPokemons().add(pokemon);
                    break;
            }

            input = scanner.nextLine();
        }
        String personName = scanner.nextLine();
        people.entrySet().stream().filter(e -> e.getKey().contains(personName))
                .forEach(e -> System.out.println(e.getValue()));
    }
}
