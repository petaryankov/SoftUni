import entities.Employee;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class P10IncreaseSalaries {
       private static final List<String> DEPARTMENTS_NAME_TO_INCREASE_SALARY =
               List.of("Engineering", "Tool Design", "Marketing", "Information Services");
    public static void main(String[] args) {
        EntityManager entityManager = Utils.createEntityManager();
        entityManager.getTransaction().begin();

        final List<Employee> employees = entityManager.createQuery("from Employee where department.name in (:depsName)", Employee.class)
                .setParameter("depsName", DEPARTMENTS_NAME_TO_INCREASE_SALARY)
                .getResultList();
        employees.forEach(e -> e.setSalary(e.getSalary().multiply(BigDecimal.valueOf(1.12))));

        entityManager.flush();
        entityManager.getTransaction().commit();
        entityManager.close();

        employees.forEach(Employee::printFullNameAndSalaryToSecondDigit);

    }
}
