package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import com.apifacturacion.rest.modelo.Promociones;

public interface IpromocionesService {
	
	List<Promociones> listar();
	
	void create(Promociones promociones);

    void edit(Promociones promociones);

    void remove(Integer id);
}
