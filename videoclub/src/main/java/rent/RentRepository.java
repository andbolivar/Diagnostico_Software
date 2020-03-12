package rent;
import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Actor;
import DAOMovie.Actor_has_Movie;
import DAORent.Rent;

public interface RentRepository extends JpaRepository<Rent, Integer>{

	Object setActor(Actor actor);
}