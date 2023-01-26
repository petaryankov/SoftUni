package MyFirstExam23October2021.hotel;

public class Person {
   //You need to create the appropriate getters and setters.
   // Override the toString() method in the following format:
    //"Person {name}: {id}, Age: {age}, Hometown: {hometown}"
    private String name;
    private int id;
    private int age;
    private String hometown;

    public Person(String name, int id, int age, String hometown) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.hometown = "n/a";
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person " + this.name).append(": " + this.id)
                .append(", Age: " + this.age).append(", Hometown: " + this.hometown);
        return sb.toString();
    }
}
