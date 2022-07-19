package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import com.apifacturacion.rest.modelo.Proveedores;

public interface IproveedoresService {
	
	List<Proveedores> listar();
	
	void create(Proveedores proveedores);

    void edit(Proveedores proveedores);

    void remove(Integer id);
}
