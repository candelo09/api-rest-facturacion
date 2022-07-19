package com.apifacturacion.rest.reposervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IpromocionesService;
import com.apifacturacion.rest.modelo.Productos;
import com.apifacturacion.rest.modelo.Promociones;
import com.apifacturacion.rest.repositorio.PromocionesRepo;

@Service
public class PromocionesService implements IpromocionesService {
	
	@Autowired
	private PromocionesRepo promocionesRepo;

	@Override
	public List<Promociones> listar() {
		// TODO Auto-generated method stub
		return (List<Promociones>) promocionesRepo.findAll();
	}

	@Override
	public void create(Promociones promociones) {
		// TODO Auto-generated method stub
		Productos nuevoProduco = new Productos();
		
		nuevoProduco.setIdProductos(1);
		
		promociones.setIdProducto(nuevoProduco);
		promocionesRepo.save(promociones);
		
	}

	@Override
	public void edit(Promociones promociones) {
		// TODO Auto-generated method stub
		
		Productos nuevoProduco = new Productos();
		
		nuevoProduco.setIdProductos(1);
		
		promociones.setIdProducto(nuevoProduco);
		promocionesRepo.save(promociones);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		promocionesRepo.deleteById(id);
	}
	
}
