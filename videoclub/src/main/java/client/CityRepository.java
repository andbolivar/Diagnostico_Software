package client;

import org.springframework.data.jpa.repository.JpaRepository;

import DAO.City;

public interface CityRepository extends JpaRepository<City, Integer>{
	
}
