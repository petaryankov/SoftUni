package ExamsPreparation.Exam23October2021.P1.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Person> roster;
    private String name;
    private int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (capacity > getCount()) {
            roster.add(person);
        }
    }

    public int getCount() {
        return roster.size();
    }

    public boolean remove(String name) {

        return roster.removeIf(person -> person.getName().equals(name));
    }

    public Person getPerson(String name, String hometown) {
        for (Person person : roster) {
            if (person.getName().equals(name) && person.getHometown().equals(hometown)) {
                return person;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        roster.forEach(person -> sb.append(person).append(System.lineSeparator()));
        return String.format("The people in the Exam1Preparation.Exam23October2021.P1.hotel %s are:\n", this.name) + sb;
    }
}
