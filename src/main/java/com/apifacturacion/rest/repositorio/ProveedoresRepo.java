package com.apifacturacion.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apifacturacion.rest.modelo.Proveedores;

@Repository
public interface ProveedoresRepo extends CrudRepository<Proveedores, Integer> {

}
