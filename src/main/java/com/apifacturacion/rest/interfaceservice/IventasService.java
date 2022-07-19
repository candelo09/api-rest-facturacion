package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import com.apifacturacion.rest.modelo.Ventas;



public interface IventasService {
	
	List<Ventas> listar();
	
	void create(Ventas colaborador);

    void edit(Ventas colaborador);

    void remove(Integer colaborador);
}
