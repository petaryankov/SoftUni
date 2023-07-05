import entities.Employee;

public class P05EmployeesFromDepartment {
    public static void main(String[] args) {
        Utils.createEntityManager()
                .createQuery("from Employee where department.name = :dName order by salary, id"
                        , Employee.class)
                .setParameter("dName", "Research and Development")
                .getResultList()
                .forEach(Employee::printFullNameDepNameAndSalary);

    }
}
