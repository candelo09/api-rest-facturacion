package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import com.apifacturacion.rest.modelo.Combos;

public interface IcombosService {
	List<Combos> listar();
	
	void create(Combos combos);

    void edit(Combos combos);

    void remove(Integer id);
}
