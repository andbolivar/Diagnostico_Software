package rent;
import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Actor;
import DAOMovie.Actor_has_Movie;
import DAORent.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer>{

	Object setActor(Actor actor);
}