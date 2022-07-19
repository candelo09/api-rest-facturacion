package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import com.apifacturacion.rest.modelo.Factura;

public interface IfacturaService {
	List<Factura> listar();
	
	void create(Factura factura);

    void edit(Factura factura);

    void remove(Integer id);
}
