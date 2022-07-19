package com.apifacturacion.rest.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apifacturacion.rest.modelo.Productos;
import com.apifacturacion.rest.reposervice.ProductosService;

@Controller
@RequestMapping(path = "/producto")
public class ProductosController {
	
	@Autowired
	private ProductosService productosService;
	
	@PostMapping(path = "/registrar")
	public @ResponseBody String insertar(@RequestBody Productos producto) {
		productosService.create(producto);
		
		return "El producto ha sido registrado";
	}
	
	@GetMapping(path = "/productos")
	public @ResponseBody List<Productos> getProductos(){
		return productosService.listar();
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Productos producto) {
		productosService.edit(producto);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id") Integer id) {
		productosService.remove(id);
	}

	
}
