package com.apifacturacion.rest.reposervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IfacturaService;
import com.apifacturacion.rest.modelo.Factura;
import com.apifacturacion.rest.modelo.Productos;
import com.apifacturacion.rest.modelo.Ventas;
import com.apifacturacion.rest.repositorio.FacturaRepo;

@Service
public class FacturaService implements IfacturaService {
	
	@Autowired
	private FacturaRepo facturaRepo;

	@Override
	public List<Factura> listar() {
		// TODO Auto-generated method stub
		return facturaRepo.findAll();
	}

	@Override
	public void create(Factura factura) {
		Productos nuevoProducto = new Productos();
		
		nuevoProducto.setIdProductos(1);
		
		factura.setIdProductos(nuevoProducto);
		
		Ventas nuevaVenta = new Ventas();
		
		nuevaVenta.setIdVentas(1);
		
		factura.setIdVentas(nuevaVenta);
		
		System.out.println(factura.getIdProductos());
		
		facturaRepo.save(factura);
	}

	@Override
	public void edit(Factura factura) {
		Productos nuevoProducto = new Productos();
		
		nuevoProducto.setIdProductos(1);
		
		factura.setIdProductos(nuevoProducto);
		
		Ventas nuevaVenta = new Ventas();
		
		nuevaVenta.setIdVentas(1);
		
		factura.setIdVentas(nuevaVenta);
		
		System.out.println(factura.getIdProductos());
		
		facturaRepo.save(factura);
		
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
		facturaRepo.deleteById(id);
		
	}

}
