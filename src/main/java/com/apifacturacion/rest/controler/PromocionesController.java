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

import com.apifacturacion.rest.modelo.Promociones;
import com.apifacturacion.rest.reposervice.PromocionesService;

@Controller
@RequestMapping(path = "/promocion")
public class PromocionesController {
	
	
	@Autowired
	private PromocionesService promocionesService;
	
	
	@PostMapping(path = "/registrar")
	public @ResponseBody void registrar(@RequestBody Promociones promocion) {
		promocionesService.create(promocion);
	}
	
	
	@GetMapping(path = "/promociones")
	public @ResponseBody List<Promociones> getPromociones(){
		return promocionesService.listar();
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Promociones promocion) {
		promocionesService.edit(promocion);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id") Integer id) {
		promocionesService.remove(id); 
	}

}
