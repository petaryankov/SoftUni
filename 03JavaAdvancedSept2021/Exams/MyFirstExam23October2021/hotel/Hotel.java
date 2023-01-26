package MyFirstExam23October2021.hotel;

import java.util.Map;
import java.util.TreeMap;

public class Hotel {
    private String name;
    private int capacity;
    Map<String, Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new TreeMap<>();
    }

    public void add(Person person) {
        if (this.capacity > this.roster.size()) {
            this.roster.put(person.getName(), person);
        }
    }

    public boolean remove(String name) {
        return this.roster.remove(name) != null;
    }

    public Person getPerson(String name, String hometown) {

        if (roster.containsKey(name)
                && roster.containsValue(hometown)) {
            return roster.get(name);
        }

        return null;
    }

    public int getCount() {
        return this.roster.size();
    }

    //"The people in the Exam1Preparation.Exam23October2021.P1.hotel {name} are:
//{Person1}
//{Person2}
//(…)"
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The people in the Exam1Preparation.Exam23October2021.P1.hotel " + this.name + "are:\n");
        roster.forEach((key, value) -> System.out.println(value));
        return sb.toString();
    }
}
