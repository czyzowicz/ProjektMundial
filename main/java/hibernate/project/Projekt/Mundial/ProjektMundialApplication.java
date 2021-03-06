package hibernate.project.Projekt.Mundial;

import hibernate.project.Projekt.Mundial.Entities.Match;
import hibernate.project.Projekt.Mundial.Entities.Team;
import hibernate.project.Projekt.Mundial.Repository.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class ProjektMundialApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TeamRepository teamRepository;

	@Autowired
	EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(ProjektMundialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Match match = em.find(Match.class, 1L);
		Team druzynaA = match.getTeamA();
		logger.info("DRUŻYNA A: {}", druzynaA);
		Team druzynaB = match.getTeamB();
		logger.info("DRUŻYNA B: {}", druzynaB);

	}
}
