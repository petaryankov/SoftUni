package day1.WorkingWithAbstractionLab.P3.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public void parseCommand(String[] commands) {

        if (commands[0].equals("Create")) {
            String name = commands[1];
            int age = Integer.parseInt(commands[2]);
            double grade = Double.parseDouble(commands[3]);
            if (!students.containsKey(name)) {
                Student student = new Student(name, age, grade);
                students.put(name, student);
            }
        } else if (commands[0].equals("Show")) {
            String name = commands[1];
            if (students.containsKey(name)) {
                Student student = students.get(name);
                String output = String.format("%s is %s years old.", student.getName(), student.getAge());

                if (student.getGrade() >= 5.00) {
                    output += " Excellent student.";
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    output += " Average student.";
                } else {
                    output += " Very nice person.";
                }

                System.out.println(output);
            }
        }
    }
}
