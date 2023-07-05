import entities.Town;

import javax.persistence.EntityManager;
import java.util.List;

public class P02ChangeCasing {
    public static void main(String[] args) {

        final EntityManager entityManager = Utils.createEntityManager();

        entityManager.getTransaction().begin();

        List<Town> allTowns = entityManager.createQuery("From Town", Town.class)
                .getResultList();

        for (Town town : allTowns) {
            if (town.getName().length() > 5) {
                entityManager.detach(town);
                continue;
            }

            town.setName(town.getName().toUpperCase());
            entityManager.persist(town);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
