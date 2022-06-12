package edu.uptc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.interfaceRepository.FacturaRepository;
import edu.uptc.model.Factura;

@Service
public class FacturaServiceImp implements FacturaService {
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public List<Factura> findAll() {
		return (List<Factura>) facturaRepository.findAll();
	}

	@Override
	public Factura save(Factura f) {
		return facturaRepository.save(f);
	}

	@Override
	public Factura findId(Integer id) {
		return facturaRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		facturaRepository.deleteById(id);
	}

}
