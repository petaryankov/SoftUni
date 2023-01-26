package ExamsPreparation.RetakeExam14April2021.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return students.size();
    }

    public String registerStudent(Student student) {
        String toPrint = "No seats in the Exam1Preparation.RetakeExam14April2021.university";
        if (getStudentCount() < capacity) {
            if (students.contains(student)) {
                toPrint = "Student is already in the Exam1Preparation.RetakeExam14April2021.university";
            } else {
                students.add(student);
                toPrint = String.format("Added student %s %s", student.getFirstName(), student.getLastName());
            }
        }
        return toPrint;

    }

    public String dismissStudent(Student student) {
        String toPrint = "Student not found";
        if (students.contains(student)) {
            toPrint = String.format("Removed student %s %s"
                    , student.getFirstName(), student.getLastName());
            students.remove(student);
        }
        return toPrint;
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName)
                    && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        students.forEach(student -> sb.append(String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s\n"
                , student.getFirstName(), student.getLastName(), student.getBestSubject())));
        return sb.toString().trim();
    }


}
