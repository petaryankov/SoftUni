import entities.Address;
import entities.Employee;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;

public class P06AddingNewAddressAndUpdatingEmployee {
    public static void main(String[] args) {

        final EntityManager entityManager = Utils.createEntityManager();
        final Scanner scanner = new Scanner(System.in);

        entityManager.getTransaction().begin();

        final String lastname = scanner.nextLine();

        final List<Employee> employees = entityManager.createQuery("from Employee where lastName = :lastName ", Employee.class)
                .setParameter("lastName", lastname)
                .getResultList();

        Address newAddress = new Address();
        newAddress.setText("Vitoshka 15");

        entityManager.persist(newAddress);

        employees.forEach(e -> e.setAddress(newAddress));

        entityManager.getTransaction().commit();
        entityManager.close();
        scanner.close();
    }
}
