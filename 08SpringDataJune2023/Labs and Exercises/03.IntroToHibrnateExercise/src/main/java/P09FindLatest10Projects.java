import entities.Project;

import javax.persistence.Query;
import java.util.Comparator;
import java.util.List;

public class P09FindLatest10Projects {
    public static void main(String[] args) {
        Utils.createEntityManager()
                .createQuery("from Project order by startDate desc, name", Project.class)
                .setMaxResults(10)
                .getResultList()
                .stream()
                .sorted(Comparator.comparing(Project::getName))
                .forEach(Project::printNameDescriptionStartAndEndDate);
    }
}
