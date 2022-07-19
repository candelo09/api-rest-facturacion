package com.apifacturacion.rest.interfaceservice;

import java.util.List;

import  com.apifacturacion.rest.modelo.Colaborador;

import org.springframework.http.ResponseEntity;

public interface IcolaboradorService {
	List<Colaborador> listar();
	
	ResponseEntity<Colaborador> create(Colaborador colaborador);

    void edit(Colaborador colaborador);

    void remove(Integer colaborador);
    
    Colaborador findByIdUsuario(Integer id_usuario);
    
    String ingresar(String colaborador);
    
    List<Colaborador> findByIdentificacion(Long identificacion);
    
    
}
