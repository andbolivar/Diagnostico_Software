package com.crud.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IclientService;
import com.crud.demo.interfaces.IClient;
import com.crud.demo.modelo.Client;
@Service

public class ClientService implements IclientService{

	@Autowired
	private IClient data;
	@Override
	public List<Client> listar() {
		
		return (List<Client>)data.findAll();
	}

	@Override
	public Optional<Client> listarId(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Client c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int idClient) {
		// TODO Auto-generated method stub
		
	}

}
