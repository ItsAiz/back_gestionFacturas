package edu.uptc.service;

import java.util.List;

import edu.uptc.model.Factura;

public interface FacturaService {
	public List<Factura> findAll();
	public Factura save(Factura f);
	public Factura findId(Integer id);
	public void delete(Integer id);
}
