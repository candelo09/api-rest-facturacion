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

import com.apifacturacion.rest.interfaceservice.IproveedoresService;
import com.apifacturacion.rest.modelo.Proveedores;

@Controller
@RequestMapping(path = "/proveedor")
public class ProveedoresController {
	
	@Autowired
	private IproveedoresService proveedoresService;
	
	@PostMapping(path = "/registrar")
	public @ResponseBody void insertar(@RequestBody Proveedores proveedores) {
		proveedoresService.create(proveedores);
	}
	
	@GetMapping(path = "/proveedores")
	public @ResponseBody List<Proveedores> getColaboradores(){
		return proveedoresService.listar();
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Proveedores proveedores) {
		proveedoresService.edit(proveedores);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id")Integer id) {
		proveedoresService.remove(id);
	}
	
}
