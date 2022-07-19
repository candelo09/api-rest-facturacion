package com.apifacturacion.rest.reposervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IproveedoresService;
import com.apifacturacion.rest.modelo.Proveedores;
import com.apifacturacion.rest.repositorio.ProveedoresRepo;

@Service
public class ProveedoresService implements IproveedoresService {
	
	@Autowired
	ProveedoresRepo proveedoresRepo;
	
	@Override
	public List<Proveedores> listar() {
		// TODO Auto-generated method stub
		return (List<Proveedores>) proveedoresRepo.findAll();
	}

	@Override
	public void create(Proveedores proveedores) {
		// TODO Auto-generated method stub
		proveedoresRepo.save(proveedores);
		
	}

	@Override
	public void edit(Proveedores proveedores) {
		// TODO Auto-generated method stub
		proveedoresRepo.save(proveedores);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		proveedoresRepo.deleteById(id);
	}

}
