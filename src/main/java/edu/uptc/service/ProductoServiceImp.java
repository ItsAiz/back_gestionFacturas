package edu.uptc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.interfaceRepository.ProductoRepository;
import edu.uptc.model.Producto;

@Service
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public Producto save(Producto p) {
		return productoRepository.save(p);
	}

	@Override
	public Producto findId(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);
		
	}

}
