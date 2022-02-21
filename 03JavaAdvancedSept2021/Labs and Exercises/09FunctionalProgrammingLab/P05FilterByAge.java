package day9.FunctionalProgrammingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5FilterByAge {
    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static int ageFilter = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        int index = 0;
        while (n-- > 0) {
            String input = scanner.nextLine();
            String personName = input.split(", ")[0];
            int personAge = Integer.parseInt(input.split(", ")[1]);
            people.add(index, new Person(personName, personAge));
            index++;
        }
        String youngOrOld = scanner.nextLine();
        ageFilter = Integer.parseInt(scanner.nextLine());
        String nameAge = scanner.nextLine();
        boolean isNameAndAge = nameAge.length() > 4;
        boolean isName = nameAge.equals("name");
        if (youngOrOld.equals("younger")) {
            if (isNameAndAge) {
                people.stream().filter(e -> e.age <= ageFilter)
                        .forEach(e -> System.out.println(e.name + " - " + e.age));
            } else if (isName) {
                people.stream().filter(e -> e.age <= ageFilter)
                        .forEach(e -> System.out.println(e.name));
            } else {
                people.stream().filter(e -> e.age <= ageFilter)
                        .forEach(e -> System.out.println(e.age));
            }
        } else {
            if (isNameAndAge) {
                people.stream().filter(e -> e.age >= ageFilter)
                        .forEach(e -> System.out.println(e.name + " - " + e.age));
            } else if (isName) {
                people.stream().filter(e -> e.age >= ageFilter)
                        .forEach(e -> System.out.println(e.name));
            } else {
                people.stream().filter(e -> e.age >= ageFilter)
                        .forEach(e -> System.out.println(e.age));
            }
        }
    }
}
