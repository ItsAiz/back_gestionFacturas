package edu.uptc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uptc.model.Cliente;
import edu.uptc.service.ClienteService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/listarCliente")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
	@PostMapping("/guardarCliente")
	public Cliente guardar(@RequestBody Cliente c){
		return clienteService.save(c);
	}
	@GetMapping("/obtenerCliente/{id}")
	public Cliente getCliente(@PathVariable Integer id) {
		return clienteService.findId(id);
	}
	@PutMapping("/listar/{id}")
	public Cliente modificar(@RequestBody Cliente c, @PathVariable Integer id) {
		Cliente clienteActual = clienteService.findId(id);
		clienteActual.setNombre(c.getNombre());
		clienteActual.setApellido(c.getApellido());
		clienteActual.setDireccion(c.getDireccion());
		clienteActual.setFecha_nacimiento(c.getFecha_nacimiento());
		clienteActual.setTelefono(c.getTelefono());
		clienteActual.setEmail(c.getEmail());
		return clienteService.save(clienteActual);
	}
	@DeleteMapping("/listar/{id}")
	public void eliminar(@PathVariable Integer id)	{
		clienteService.delete(id);
	}
}
