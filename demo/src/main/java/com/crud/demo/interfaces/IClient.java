package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.crud.demo.modelo.Client;

public interface IClient extends CrudRepository<Client, Integer>{

}
