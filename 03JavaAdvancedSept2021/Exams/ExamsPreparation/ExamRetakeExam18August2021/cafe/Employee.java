package ExamsPreparation.ExamRetakeExam18August2021.cafe;

public class Employee {
    private String name;
    private int age;
    private String country;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Employee(Employee employee) {

    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        //"Employee: {name}, {age} from {country}"
        StringBuilder sb = new StringBuilder();
        return String.format("Employee: %s, %d from %s"
                , this.name, this.age, this.country);

    }
}
