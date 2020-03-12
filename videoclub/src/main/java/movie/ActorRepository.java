package movie;

import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer>{
}