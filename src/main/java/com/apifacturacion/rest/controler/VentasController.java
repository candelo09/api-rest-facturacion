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

import com.apifacturacion.rest.modelo.Ventas;
import com.apifacturacion.rest.reposervice.VentasService;


@Controller
@RequestMapping(path = "/ventas")
public class VentasController {
	
	@Autowired
	private VentasService ventasService;
	
	@PostMapping(path = "/registrar")
	public @ResponseBody void insertar(@RequestBody Ventas venta) {
		ventasService.create(venta);
	}
	
	@GetMapping(path = "/ventas")
	public @ResponseBody List<Ventas>getVentas(){
		return ventasService.listar();
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Ventas ventas) {
		ventasService.edit(ventas);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id")Integer id) {
		ventasService.remove(id);
	}

}
