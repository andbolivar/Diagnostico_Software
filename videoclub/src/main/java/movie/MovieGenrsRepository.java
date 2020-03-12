package movie;


import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.MovieGenrs;

public interface MovieGenrsRepository extends JpaRepository<MovieGenrs, Integer>{
}