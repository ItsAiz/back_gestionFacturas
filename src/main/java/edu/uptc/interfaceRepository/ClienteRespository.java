package edu.uptc.interfaceRepository;

import org.springframework.data.repository.CrudRepository;

import edu.uptc.model.Cliente;

public interface ClienteRespository extends CrudRepository<Cliente, Integer> {
	
}
