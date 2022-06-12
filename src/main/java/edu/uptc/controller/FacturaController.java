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

import edu.uptc.model.Factura;
import edu.uptc.service.FacturaService;

@RestController
@CrossOrigin(origins = "http://localhost4200")
@RequestMapping("/facturas")
public class FacturaController {
	@Autowired
	private FacturaService facturaService;
	
	@GetMapping("/listarFactura")
	public List<Factura> listar(){
		return facturaService.findAll();
	}
	@PostMapping("/guardarFactura")
	public Factura guardar(@RequestBody Factura f){
		return facturaService.save(f);
	}
	@GetMapping("/obtenerFactura/{id}")
	public Factura getFactura(@PathVariable Integer id) {
		return facturaService.findId(id);
	}
	@PutMapping("/listar/{id}")
	public Factura modificar(@RequestBody Factura f, @PathVariable Integer id) {
		Factura facturaActual = facturaService.findId(id);
		facturaActual.setFecha(f.getFecha());
		return facturaService.save(facturaActual);
	}
	@DeleteMapping("/listar/{id}")
	public void eliminar(@PathVariable Integer id)	{
		facturaService.delete(id);
	}
}
