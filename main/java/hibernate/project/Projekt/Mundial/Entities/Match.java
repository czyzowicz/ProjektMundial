package hibernate.project.Projekt.Mundial.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Match {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    public Team teamA;

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    @ManyToOne
    public Team teamB;

    public Long getId() {
        return id;
    }

    protected Match() {
    }


}


