package com.apifacturacion.rest.reposervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IcombosService;
import com.apifacturacion.rest.modelo.Combos;
import com.apifacturacion.rest.modelo.Productos;
import com.apifacturacion.rest.repositorio.CombosRepo;

@Service
public class CombosService implements IcombosService {
	
	@Autowired
	private CombosRepo combosRepo;
	
	@Override
	public List<Combos> listar() {
		// TODO Auto-generated method stub
		return (List<Combos>) combosRepo.findAll();
	}

	@Override
	public void create(Combos combos) {
		// TODO Auto-generated method stub
		Productos nuevoProducto = new Productos();
		nuevoProducto.setIdProductos(1);
		combos.setIdProducto(nuevoProducto);
		combosRepo.save(combos);
		
	}

	@Override
	public void edit(Combos combos) {
		// TODO Auto-generated method stub
		Productos nuevoProducto = new Productos();
		nuevoProducto.setIdProductos(1);
		combos.setIdProducto(nuevoProducto);
		combosRepo.save(combos);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		combosRepo.deleteById(id);
	}

}
