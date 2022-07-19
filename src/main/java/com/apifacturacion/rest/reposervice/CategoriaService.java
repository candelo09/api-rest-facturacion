package com.apifacturacion.rest.reposervice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IcategoriaService;
import com.apifacturacion.rest.modelo.Categoria;
import com.apifacturacion.rest.repositorio.CategoriaRepo;

@Service
public class CategoriaService implements IcategoriaService {
	
	@Autowired
	private CategoriaRepo categoriaRepo;

	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return categoriaRepo.findAll();
	}

	@Override
	public void create(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaRepo.save(categoria);
		
	}

	@Override
	public void edit(Categoria categoria) {
		categoriaRepo.save(categoria);
		
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		categoriaRepo.deleteById(id);
		
	}

}
