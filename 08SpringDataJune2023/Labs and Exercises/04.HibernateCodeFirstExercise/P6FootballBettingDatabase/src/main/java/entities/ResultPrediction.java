package entities;

import entities.enums.ResultPredictionValue;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class ResultPrediction extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private ResultPredictionValue resultPrediction;
}
