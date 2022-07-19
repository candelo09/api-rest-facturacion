package com.apifacturacion.rest.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apifacturacion.rest.interfaceservice.IcategoriaService;
import com.apifacturacion.rest.modelo.Categoria;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping(path = "/categoria")
public class CategoriaController {
	
	@Autowired
	private IcategoriaService categoriaService;
	
	@PostMapping(path = "/registrar")
	public @ResponseBody void insertar(@RequestBody Categoria categoria) {
		categoriaService.create(categoria);
	}
	
	@GetMapping(path = "/categorias")
	public @ResponseBody List<Categoria> getColaboradores(){
		return categoriaService.listar();
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Categoria categoria) {
		categoriaService.edit(categoria);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id")Integer id) {
		categoriaService.remove(id);
	}

}
