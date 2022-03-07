package day12.DefiningClassesExercises.Demo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departments = new HashMap<>();

        while (line-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            String email = "n/a";
            int age = -1;

            if (data.length == 6) {
                email = data[4];
                age = Integer.parseInt(data[5]);
            } else if (data.length != 4) {
                try {
                    age = Integer.parseInt(data[4]);
                } catch (NumberFormatException е) {
                    email = data[4];
                }
            }
            Employee employee = new Employee(name, salary, position, department, email, age);
            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployees().add(employee);
        }
        Department maxDepartment = departments
                .entrySet().stream()
                .max(Comparator.comparing(e -> e.getValue().getAverageSalary())).get().getValue();
        System.out.println("Highest Average Salary: " + maxDepartment.getName());
        maxDepartment.getEmployees().stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
    }
}
