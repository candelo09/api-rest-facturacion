package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import com.apifacturacion.rest.modelo.Productos;

public interface IProductosService {
	List<Productos> listar();
	
	void create(Productos productos);

    void edit(Productos productos);

    void remove(Integer id);
}
