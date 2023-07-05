import entities.Employee;

import java.util.Scanner;

public class P11FindEmployeesByFirstName {
    public static void main(String[] args) {
        Utils.createEntityManager()
                .createQuery("from Employee where firstName like :input", Employee.class)
                .setParameter("input", new Scanner(System.in).nextLine() + "%")
                .getResultList()
                .forEach(Employee::printFullNameJobTitleAndSalaryToSecondDigit);
    }
}
