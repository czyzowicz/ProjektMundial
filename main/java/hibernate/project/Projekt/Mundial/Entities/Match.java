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

    @ManyToOne
    public Team teamB;

    public Long getId() {
        return id;
    }

    protected Match() {
    }


}


