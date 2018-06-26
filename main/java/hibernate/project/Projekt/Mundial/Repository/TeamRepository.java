package hibernate.project.Projekt.Mundial.Repository;

import hibernate.project.Projekt.Mundial.Entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class TeamRepository {
    @Autowired
    EntityManager em;

    public Team findyById (Long id){
        return em.find(Team.class, id);
    }

    public void deleteById (Long id) {
        Team team = findyById(id);
        em.remove(team);
    }

    public Team save (Team team) {
        if (team.getId() == null){
            em.persist(team);
        }
        else {
            em.merge(team);
        }
        return team;
    }


}
