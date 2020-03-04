package com.crud.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Client;

public interface IclientService {
public List<Client>listar();
public Optional<Client>listarId(int idClient);
public int save(Client c);
public void delete (int idClient);
}
