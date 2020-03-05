package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Client;
@Repository
public interface IClient extends CrudRepository<Client, Integer>{

}
