package edu.uptc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.interfaceRepository.ClienteRespository;
import edu.uptc.model.Cliente;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	private ClienteRespository clienteRespository;
	
	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteRespository.findAll();
	}

	@Override
	public Cliente save(Cliente c) {
		return clienteRespository.save(c);
	}

	@Override
	public Cliente findId(Integer id) {
		return clienteRespository.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		clienteRespository.deleteById(id);
		
	}

}
