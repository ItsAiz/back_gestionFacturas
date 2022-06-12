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
import edu.uptc.model.Producto;
import edu.uptc.service.ProductoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/listarProducto")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	@PostMapping("/guardarProducto")
	public Producto guardar(@RequestBody Producto p){
		return productoService.save(p);
	}
	@GetMapping("/obtenerProducto/{id}")
	public Producto getProducto(@PathVariable Integer id) {
		return productoService.findId(id);
	}
	@PutMapping("/modificar/{id}")
	public Producto modificar(@RequestBody Producto p, @PathVariable Integer id) {
		Producto productoActual = productoService.findId(id);
		productoActual.setNombre(p.getNombre());
		productoActual.setPrecio(p.getPrecio());
		productoActual.setStock(p.getStock());
		return productoService.save(productoActual);
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id)	{
		productoService.delete(id);
	}
}
