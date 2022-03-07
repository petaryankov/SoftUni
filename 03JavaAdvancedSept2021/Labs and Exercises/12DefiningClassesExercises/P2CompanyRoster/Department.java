package day12.DefiningClassesExercises.P2CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    List<Employee> employees;
    String name;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double getAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
}
