package movie;


import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieGenrsRepository extends JpaRepository<MovieGenrs, Integer>{
}