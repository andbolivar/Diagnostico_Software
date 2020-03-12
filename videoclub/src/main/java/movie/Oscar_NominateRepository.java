package movie;

import org.springframework.data.jpa.repository.JpaRepository;

import DAOMovie.Oscar_Nominate;

public interface Oscar_NominateRepository extends JpaRepository<Oscar_Nominate, Integer>{
}