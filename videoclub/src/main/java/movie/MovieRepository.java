package movie;
import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
}
