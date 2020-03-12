package rent;
import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Actor;
import DAOMovie.Actor_has_Movie;
import DAORent.Subtitle;

public interface SubtitleRepository extends JpaRepository<Subtitle, Integer>{

	Object setActor(Actor actor);
}