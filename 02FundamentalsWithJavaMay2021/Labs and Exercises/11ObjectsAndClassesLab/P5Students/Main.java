package day11ObjectsAndClassesLab.P5Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!command.equals("end")) {
            String[] currentStudent = command.split(" ");

            String firstName = currentStudent[0];
            String lastName = currentStudent[1];
            int age = Integer.parseInt(currentStudent[2]);
            String town = currentStudent[3];

            Student student = new Student(firstName, lastName, age, town);

            students.add(student);

            command = scanner.nextLine();
        }
        String filterCity = scanner.nextLine();
        for (Student student : students) {
            if (student.getTown().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(),
                         student.getLastName(), student.getAge());
            }
        }
    }
}
