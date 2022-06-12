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

import edu.uptc.model.Detalle;
import edu.uptc.service.DetalleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/detalles")
public class DetalleController {
	@Autowired
	private DetalleService detalleService;
	
	@GetMapping("/listarDetalle")
	public List<Detalle> listar(){
		return detalleService.findAll();
	}
	@PostMapping("/guardarDetalle")
	public Detalle guardar(@RequestBody Detalle d){
		return detalleService.save(d);
	}
	@GetMapping("/obtenerDetalle/{id}")
	public Detalle getDetalle(@PathVariable Integer id) {
		return detalleService.findId(id);
	}
	@PutMapping("/listar/{id}")
	public Detalle modificar(@RequestBody Detalle d, @PathVariable Integer id) {
		Detalle detalleActual = detalleService.findId(id);
		detalleActual.setCantidad(d.getCantidad());
		detalleActual.setPrecio(d.getPrecio());
		return detalleService.save(detalleActual);
	}
	@DeleteMapping("/listar/{id}")
	public void eliminar(@PathVariable Integer id)	{
		detalleService.delete(id);
	}
}
