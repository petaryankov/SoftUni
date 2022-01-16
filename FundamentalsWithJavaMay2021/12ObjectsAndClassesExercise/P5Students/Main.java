package day12ObjectsAndClassesExercise.P5Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= numOfStudents; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            Student student = new Student(studentData[0], studentData[1]
                    , Double.parseDouble(studentData[2]));
            students.add(student);
        }
        students.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(students);
        for (Student student : students) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName()
                    , student.getLastName(), student.getGrade());
        }
    }
}
