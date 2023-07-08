package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class Game extends BaseEntity {

   @OneToOne
   @JoinColumn
    private Team homeTeam;

   @OneToOne
   @JoinColumn
    private Team awayTeam;

   @Column(name = "home_goals")
    private Short homeGoals;

   @Column(name = "away_goals")
    private Short awayGoals;

   @Column
    private Date date;

   @Column(name = "win_bet_rate")
    private Double winBetRate;

   @Column(name = "away_bet_rate")
    private Double awayBetRate;

   @Column(name = "draw_bet_rate")
    private Double drawBetRate;

   @ManyToOne
   @JoinColumn
    private Round round;

   @ManyToOne
   @JoinColumn
    private Competition competition;
}
