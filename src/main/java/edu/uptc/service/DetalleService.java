package edu.uptc.service;

import java.util.List;

import edu.uptc.model.Detalle;

public interface DetalleService {
	public List<Detalle> findAll();
	public Detalle save(Detalle d);
	public Detalle findId(Integer id);
	public void delete(Integer id);
}
