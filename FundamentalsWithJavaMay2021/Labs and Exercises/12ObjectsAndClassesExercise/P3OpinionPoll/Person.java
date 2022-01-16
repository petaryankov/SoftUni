package day12ObjectsAndClassesExercise.P3OpinionPoll;

public class Person {
    //prints all people whose age is more than 30 years
    // , sorted in alphabetical order.
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
