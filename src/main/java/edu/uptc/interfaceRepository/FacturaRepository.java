package edu.uptc.interfaceRepository;

import org.springframework.data.repository.CrudRepository;

import edu.uptc.model.Factura;

public interface FacturaRepository extends CrudRepository<Factura, Integer>{
	
}
