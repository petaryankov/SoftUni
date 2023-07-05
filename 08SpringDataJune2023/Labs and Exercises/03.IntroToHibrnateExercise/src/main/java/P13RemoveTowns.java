import entities.Town;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class P13RemoveTowns {
    public static void main(String[] args) {
        EntityManager entityManager = Utils.createEntityManager();
        entityManager.getTransaction().begin();

        Town town = entityManager.createQuery("from Town where name = :inputName", Town.class)
                .setParameter("inputName", new Scanner(System.in).nextLine())
                .getSingleResult();
        System.out.println(town.getName());
    }
}
