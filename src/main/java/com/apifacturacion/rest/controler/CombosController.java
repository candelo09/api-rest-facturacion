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

import com.apifacturacion.rest.modelo.Combos;
import com.apifacturacion.rest.reposervice.CombosService;


@Controller
@RequestMapping(path = "/combo")
public class CombosController {
	
	@Autowired
	private CombosService combosService;
	
	
	@PostMapping(path = "/registrar")
	public @ResponseBody void insertar(@RequestBody Combos combos) {
		combosService.create(combos);
	}
	
	@GetMapping(path = "/combos")
	public @ResponseBody List<Combos> getCombos(){
		return combosService.listar();
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Combos combos) {
		combosService.edit(combos);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id") Integer id) {
		combosService.remove(id);
	}
}
