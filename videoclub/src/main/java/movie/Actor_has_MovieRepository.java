package movie;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Actor_has_MovieRepository extends JpaRepository<Actor_has_Movie, Integer>{

	Object setActor(Actor actor);
}