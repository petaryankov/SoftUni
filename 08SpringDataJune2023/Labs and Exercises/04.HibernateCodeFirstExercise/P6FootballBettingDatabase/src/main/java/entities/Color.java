package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
@Getter
@Setter
public class Color extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String name;
}
