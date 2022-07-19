package com.apifacturacion.rest.reposervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IventasService;
import com.apifacturacion.rest.modelo.Colaborador;
import com.apifacturacion.rest.modelo.Ventas;
import com.apifacturacion.rest.repositorio.VentasRepo;

@Service
public class VentasService implements IventasService {
	
	@Autowired
	private VentasRepo  ventasRepo;

	@Override
	public List<Ventas> listar() {
		// TODO Auto-generated method stub
		return ventasRepo.findAll();
	}

	@Override
	public void create(Ventas ventas) {
		Colaborador co = new Colaborador();
		co.setIdUsuario(2);
		ventas.setIdColaborador(co);
		ventasRepo.save(ventas);
		
	}

	@Override
	public void edit(Ventas ventas) {
		// TODO Auto-generated method stub
		Colaborador co = new Colaborador();
		co.setIdUsuario(1);
		ventas.setIdColaborador(co);
		ventasRepo.save(ventas);
		
	}

	@Override
	public void remove(Integer ventas) {
		// TODO Auto-generated method stub
		ventasRepo.deleteById(ventas);
		
	}

}
