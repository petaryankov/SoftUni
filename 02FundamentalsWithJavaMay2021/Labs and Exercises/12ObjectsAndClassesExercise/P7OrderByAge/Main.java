package day12ObjectsAndClassesExercise.P7OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String peopleData = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!peopleData.equals("End")) {
            String[] inputData = peopleData.split("\\s+");
            String name = inputData[0];
            String id = inputData[1];
            int age = Integer.parseInt(inputData[2]);
            Person person = new Person(name, id, age);
            people.add(person);

            peopleData = scanner.nextLine();
        }
        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName()
                    , person.getId(), person.getAge());
        }
    }
}
