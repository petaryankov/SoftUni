package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class Bet extends BaseEntity {

    @Column
    private BigDecimal money;

    @Column(name = "bet_time")
    private Date betTime;

    @ManyToOne
    private User user;


}
