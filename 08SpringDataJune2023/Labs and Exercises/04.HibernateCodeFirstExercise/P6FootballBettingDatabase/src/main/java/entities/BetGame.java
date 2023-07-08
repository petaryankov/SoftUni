package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class BetGame {

    @Id
    @OneToOne
    private Game game;

    @Id
    @OneToOne
    private Bet bet;

    @OneToOne
    @JoinColumn
    private ResultPrediction resultPrediction;




}
