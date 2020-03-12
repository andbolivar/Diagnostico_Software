package rent;

import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Actor;
import DAOMovie.Actor_has_Movie;
import DAORent.Stock_has_Rent;

public interface Stock_has_RentRepository extends JpaRepository<Stock_has_Rent, Integer>{

	Object setActor(Actor actor);
}