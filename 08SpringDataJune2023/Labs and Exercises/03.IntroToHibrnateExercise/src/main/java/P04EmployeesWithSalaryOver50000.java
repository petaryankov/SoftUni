import entities.Employee;

public class P04EmployeesWithSalaryOver50000 {
    public static void main(String[] args) {
        Utils.createEntityManager()
        .createQuery("from Employee where salary > 50000", Employee.class)
                .getResultList()
                .forEach(employee -> System.out.println(employee.getFirstName()));
    }
}
