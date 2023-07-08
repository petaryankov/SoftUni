package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class PlayerStatistics {

    @Id
    @ManyToOne
    @JoinColumn
    private Game game;

    @Id
    @ManyToOne
    @JoinColumn
    private Player player;

    @Column(name = "scored_goals")
    private Short scoredGoals;

    @Column(name = "player_assist")
    private Short playerAssist;

    @Column(name = "played_minutes")
    private Short playedMinutes;


}
