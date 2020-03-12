package client;


import org.springframework.data.jpa.repository.JpaRepository;

import DAO.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{
}