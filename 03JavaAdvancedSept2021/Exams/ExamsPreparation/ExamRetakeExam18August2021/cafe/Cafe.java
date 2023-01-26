package ExamsPreparation.ExamRetakeExam18August2021.cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        boolean isContain = employees.contains(employee);
        if (this.employees.size() < this.capacity && !isContain) {
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        int listSize = employees.size();
        employees.removeIf(e -> e.getName().equals(name));
        return listSize != employees.size();
    }

    public Employee getOldestEmployee() {
        return employees.stream()
                .max(Comparator.comparing(Employee::getAge)).get();
    }

    public Employee getEmployee(String name) {
        for (Employee employee : this.employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount() {
       return this.employees.size();
    }

    public String report() {
        //Employees working at Cafe {cafeName}:
        //{Employee1}
        StringBuilder sb = new StringBuilder();
        sb.append("Employees working at Cafe ").append(this.name).append(":\n");
        employees.forEach(e -> sb.append(e.toString()).append("\n"));
        return sb.toString();
    }
}
