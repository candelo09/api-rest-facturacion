package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import com.apifacturacion.rest.modelo.Categoria;

public interface IcategoriaService {
	
	List<Categoria> listar();
	
	void create(Categoria categoria);

    void edit(Categoria categoria);

    void remove(Integer categoria);
}
