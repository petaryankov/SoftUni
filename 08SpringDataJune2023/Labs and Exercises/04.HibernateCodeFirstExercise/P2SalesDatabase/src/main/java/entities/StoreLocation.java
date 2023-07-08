package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class StoreLocation extends BaseEntity {
    @Column(name = "location_name")
    private String locationName;
    @OneToMany(mappedBy = "storeLocation")
    private Set<Sale> sales;
}
