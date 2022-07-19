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

import com.apifacturacion.rest.modelo.Factura;
import com.apifacturacion.rest.reposervice.FacturaService;

@Controller
@RequestMapping(path = "/factura")
public class FacturaController {
	
	@Autowired
	private FacturaService facturaSerivice;
	
	
	@PostMapping(path = "/registrar")
	public @ResponseBody void registrar(@RequestBody Factura factura) {
		facturaSerivice.create(factura);
	}
	
	@GetMapping(path = "/facturas")
	public @ResponseBody List<Factura> getFacturas(){
		return facturaSerivice.listar();
	}
	
	@PutMapping(path = "/modificar")
	public @ResponseBody void modificar(@RequestBody Factura factura) {
		facturaSerivice.edit(factura);
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable("id") Integer id) {
		facturaSerivice.remove(id);
	}

}
