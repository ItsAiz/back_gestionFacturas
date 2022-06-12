package edu.uptc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.interfaceRepository.DetalleRepository;
import edu.uptc.model.Detalle;

@Service
public class DetalleServiceImp implements DetalleService{

	@Autowired 
	private DetalleRepository detalleRepository;
	
	@Override
	public List<Detalle> findAll() {
		return (List<Detalle>) detalleRepository.findAll();
	}

	@Override
	public Detalle save(Detalle d) {
		return detalleRepository.save(d);
	}

	@Override
	public Detalle findId(Integer id) {
		return detalleRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {	
		detalleRepository.deleteById(id);
	}

}
