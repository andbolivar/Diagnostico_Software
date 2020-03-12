package rent;
import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Actor;
import DAOMovie.Actor_has_Movie;
import DAORent.Cost_Day;

public interface Cost_DayRepository extends JpaRepository<Cost_Day, Integer>{

	Object setActor(Actor actor);
}