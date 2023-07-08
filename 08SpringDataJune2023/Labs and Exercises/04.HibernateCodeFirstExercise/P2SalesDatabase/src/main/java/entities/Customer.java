package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Customer extends BaseEntity {
    @Column
    private String name;
    @Column
    private String email;
    @Column(name = "credit_card_number")
    private String creditCardNumber;
    @OneToMany
    private Set<Sale> sales;
}
