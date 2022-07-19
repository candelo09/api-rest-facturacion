package com.apifacturacion.rest.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import com.apifacturacion.rest.interfaceservice.IcolaboradorService;
import com.apifacturacion.rest.modelo.Colaborador;
import com.apifacturacion.rest.repositorio.ColaboradorRepo;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
@RequestMapping(path = "/colaborador")
public class ColaboradorController {
	
	@Autowired
	private IcolaboradorService colaboradorServicio;
	
	@PostMapping(path = "/registrar")
	public @ResponseBody ResponseEntity<Colaborador> insertar(@RequestBody Colaborador colaborador) {

		return colaboradorServicio.create(colaborador);
	}
	
	@GetMapping(path = "/colaboradores")
	public @ResponseBody List<Colaborador> getColaboradores(){
		return colaboradorServicio.listar();
	}
	
	@GetMapping(path = "/findcolaborador/{id}")
	public @ResponseBody Colaborador findColaboradorById(@PathVariable("id") Integer id){
		return colaboradorServicio.findByIdUsuario(id);
	}
	
	@GetMapping(path = "/colaboradores/{nombreUsuario}")
	public @ResponseBody void traerUsuario(@PathVariable("nombreUsuario") 
	String colaborador) {
	

			if(colaboradorServicio.ingresar(colaborador) != null) {
				colaboradorServicio.ingresar(colaborador);
			}
			
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Colaborador colaborador) {
		colaboradorServicio.edit(colaborador);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id")Integer id) {
		colaboradorServicio.remove(id);
	}
	
	
	@GetMapping("findbyIdentif/{identificacion}")
	public @ResponseBody List<Colaborador> findByIdentificacion(@PathVariable("identificacion") Long identificacion){
		return colaboradorServicio.findByIdentificacion(identificacion);
	}
	

}
