import entities.Address;

import javax.persistence.EntityManager;

public class P07AddressesWithEmployeeCount {
    public static void main(String[] args) {

        EntityManager entityManager = Utils.createEntityManager();

        entityManager.createQuery("from Address order by employees.size desc", Address.class)
                .setMaxResults(10)
                .getResultList()
                .forEach(Address::printGeneralInformation);

    }
}
