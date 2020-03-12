package movie;

import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Oscars;

public interface OscarRepository extends JpaRepository<Oscars, Integer>{
}