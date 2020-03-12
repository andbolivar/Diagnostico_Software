package rent;

import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Actor;
import DAOMovie.Actor_has_Movie;
import DAORent.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{

}