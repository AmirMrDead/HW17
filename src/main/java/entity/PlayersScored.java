package entity;

import base.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class PlayersScored extends BaseEntity {

    private int numberOfGoals;
    @ManyToOne(cascade = CascadeType.ALL)
    private GameInformation gameInformation;
    @ManyToOne(cascade = CascadeType.ALL)
    private Player player;

}
