package edu.uptc.service;

import java.util.List;

import edu.uptc.model.Cliente;

public interface ClienteService {
	public List<Cliente> findAll();
	public Cliente save(Cliente c);
	public Cliente findId(Integer id);
	public void delete(Integer id);
}
