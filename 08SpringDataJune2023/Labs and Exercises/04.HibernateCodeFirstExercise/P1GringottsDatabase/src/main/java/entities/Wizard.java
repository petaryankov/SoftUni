package entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "wizard")
public class Wizard {
    //wizard info
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 60)
    private String lastName;
    @Column(length = 1000, columnDefinition = "TEXT")
    private String notes;
    @Column(nullable = false)
    private Integer age;
    @OneToOne
    @JoinColumn
    private MagicWand magicWand;
    @OneToMany
    @JoinTable(name = "wizard_deposits")
    private List<Deposit> deposits;

}
