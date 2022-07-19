package com.apifacturacion.rest.reposervice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IProductosService;
import com.apifacturacion.rest.modelo.Categoria;
import com.apifacturacion.rest.modelo.Productos;
import com.apifacturacion.rest.modelo.Proveedores;
import com.apifacturacion.rest.repositorio.ProductosRepo;

@Service
public class ProductosService implements IProductosService {
	
	@Autowired
	private ProductosRepo productosRepo;

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return productosRepo.findAll();
	}

	@Override
	public void create(Productos productos) {
		// TODO Auto-generated method stub
		Categoria nuevaCategoria = new Categoria();
		
		nuevaCategoria.setIdCategoria(1);
		
		productos.setIdCategorias(nuevaCategoria);
		
		Proveedores nuevoProveedor = new Proveedores();
		
		nuevoProveedor.setIdProveedores(1);
		
		Date fecha = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		
		productos.setFecha(fecha);
		
		System.out.println(productos.getFecha());
		
		productos.setIdProveedor(nuevoProveedor);
		
		productosRepo.save(productos);
		
		
	}

	@Override
	public void edit(Productos productos) {
		// TODO Auto-generated method stub
		Categoria nuevaCategoria = new Categoria();
		
		nuevaCategoria.setIdCategoria(1);
		
		productos.setIdCategorias(nuevaCategoria);
		
		Proveedores nuevoProveedor = new Proveedores();
		
		nuevoProveedor.setIdProveedores(1);
		
		productos.setIdProveedor(nuevoProveedor);
		
		productosRepo.save(productos);
		
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
		productosRepo.deleteById(id);
		
	}

}
