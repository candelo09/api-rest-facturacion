package com.apifacturacion.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.apifacturacion.rest.modelo.Persona;

public interface PersonaRepo extends JpaRepository<Persona, Integer> {
	
}
