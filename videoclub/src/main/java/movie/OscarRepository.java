package movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OscarRepository extends JpaRepository<Oscars, Integer>{
}