package com.apifacturacion.rest.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.apifacturacion.rest.modelo.Colaborador;

@Repository
public interface ColaboradorRepo extends CrudRepository<Colaborador, Integer>{

	Colaborador findByNombreuser(String nombreuser);
	
	public Colaborador findByIdUsuario(Integer idUsuario);
	
	List<Colaborador> findByIdentificacion(Long identificacion);

	
}
