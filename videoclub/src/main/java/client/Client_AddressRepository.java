package client;

import org.springframework.data.jpa.repository.JpaRepository;

import DAO.City;
import DAO.Client_Address;

public interface Client_AddressRepository extends JpaRepository<Client_Address, Integer>{
	
}
