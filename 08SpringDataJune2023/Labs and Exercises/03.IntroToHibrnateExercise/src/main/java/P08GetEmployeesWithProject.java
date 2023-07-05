import entities.Employee;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class P08GetEmployeesWithProject {
    public static void main(String[] args) {

        Utils.createEntityManager()
                .createQuery("from Employee where id = :employeeId ", Employee.class)
                .setParameter("employeeId", new Scanner(System.in).nextInt())
                .getSingleResult()
                .printFullNameJobTitleAndProjects();
    }
}
