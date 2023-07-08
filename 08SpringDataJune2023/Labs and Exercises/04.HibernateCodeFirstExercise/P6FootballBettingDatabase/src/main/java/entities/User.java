package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String Username;

    @Column(nullable = false)
    private String Password;

    @Column(nullable = false, unique = true)
    private String Email;

    @Column(name = "full_name")
    private String FullName;

    @Column
    private BigDecimal balance;

}
