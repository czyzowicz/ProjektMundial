package hibernate.project.Projekt.Mundial.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    public Coach coach;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    private List<Player> players = new ArrayList<>();

    @OneToMany
    private List<Match> matches = new ArrayList<>();

    protected Team (){}

    public Team (String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
