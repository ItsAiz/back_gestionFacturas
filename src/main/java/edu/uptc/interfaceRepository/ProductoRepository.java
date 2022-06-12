package edu.uptc.interfaceRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import edu.uptc.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer>{

}
