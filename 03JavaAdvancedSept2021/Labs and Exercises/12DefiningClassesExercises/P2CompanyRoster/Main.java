package day12.DefiningClassesExercises.P2CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();
        Map<String, Department> departments = new HashMap<>();

        while (line-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email;
            int age;
            Employee employee;
            if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position
                        , department, email, age);
                employees.add(employee);
            } else if (input.length == 5) {
                try {
                    age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                    employees.add(employee);
                } catch (NumberFormatException e) {
                    email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                    employees.add(employee);
                }
            } else {
                employee = new Employee(name, salary, position, department);
                employees.add(employee);
            }
            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployees().add(employee);
        }
        Department highestPaidDepartment = departments.entrySet().
                stream().max(Comparator.comparing(entry -> entry.getValue()
                        .getAverageSalary())).get().getValue();
        System.out.println("Highest Average Salary: " + highestPaidDepartment.name);
        highestPaidDepartment.getEmployees().stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
    }
}
