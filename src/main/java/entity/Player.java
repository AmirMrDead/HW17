package entity;

import entity.enums.Position;
import entity.enums.SalesStatus;
import entity.supers.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player extends Person {

    private Byte TShirtNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    private Club club;
    private Double value;
    private Double transferValue;
    @Enumerated(EnumType.STRING)
    private SalesStatus salesStatus;
    private Short numberOfGoalsScored;
    private String gamesPlayed;
    //private Short numberOfYellowCards;
    //private Short numberOfRedCards;
    @Enumerated(EnumType.STRING)
    private Position position;

    public Player(String firstname, String lastname, String nationalCode) {
        super(firstname, lastname, nationalCode);
    }
}
