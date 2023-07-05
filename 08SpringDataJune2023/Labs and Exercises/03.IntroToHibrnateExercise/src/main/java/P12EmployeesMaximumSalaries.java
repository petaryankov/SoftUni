import entities.Department;
import entities.Employee;

import java.util.ArrayList;

public class P12EmployeesMaximumSalaries {
    public static void main(String[] args) {
        Utils.createEntityManager()
                .createQuery("select department .name, max (e .salary) from Employee as e " +
                        "group by department.name having max (e.salary) not between 30000 and 70000",
                        Object[].class)
                .getResultList()
                .forEach(objects -> System.out.printf("%s %s\n", objects[0], objects[1]));
    }
}
