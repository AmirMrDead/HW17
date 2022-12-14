package entity;

import entity.enums.SalesStatus;
import entity.supers.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Coach extends Person {

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "coach")
    private Club club;
    private Double value;
    private Double transferValue;
    @Enumerated(EnumType.STRING)
    private SalesStatus salesStatus;
    private Short numberOfWins;
    private Short numberOfLosses;
    private Short numberOfDraws;

    public Coach(String firstname, String lastname, String nationalCode, Double value) {
        super(firstname, lastname, nationalCode);
        this.value = value;
    }
}
