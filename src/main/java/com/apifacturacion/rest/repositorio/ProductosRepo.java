package com.apifacturacion.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apifacturacion.rest.modelo.Productos;

@Repository
public interface ProductosRepo extends JpaRepository<Productos, Integer> {

}
