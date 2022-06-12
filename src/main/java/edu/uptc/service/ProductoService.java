package edu.uptc.service;

import java.util.List;

import edu.uptc.model.Producto;

public interface ProductoService {
	public List<Producto> findAll();
	public Producto save(Producto p);
	public Producto findId(Integer id);
	public void delete(Integer id);
}
