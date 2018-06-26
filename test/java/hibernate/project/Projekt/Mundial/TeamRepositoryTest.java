package hibernate.project.Projekt.Mundial;

import hibernate.project.Projekt.Mundial.Entities.Team;
import hibernate.project.Projekt.Mundial.Repository.TeamRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest(classes = ProjektMundialApplication.class)
public class TeamRepositoryTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    @Autowired
    TeamRepository teamRepository;

    @Test
    public void findById(){
        Team team = teamRepository.findyById(100L);
        assertEquals("Denmark", team.getName());
    }

    @Test
    @DirtiesContext
    public void save_edit () {
        Team team = teamRepository.findyById(100L);
        assertEquals("Denmark", team.getName());
        team.setName("Denmark - Dania");
        teamRepository.save(team);
        Team team1 = teamRepository.findyById(100L);
        assertEquals("Denmark - Dania", team1.getName());
    }

    @Test
    @DirtiesContext
    public void save_insert () {
        Team team = teamRepository.findyById(1L);
        assertNull(team);
        team = new Team ("Denmark - Test" );
        teamRepository.save(team);
        Team team1 = teamRepository.findyById(1L);
        assertEquals("Denmark - Test", team1.getName());
    }
}
