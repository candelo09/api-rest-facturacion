package com.apifacturacion.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apifacturacion.rest.modelo.Ventas;

@Repository
public interface VentasRepo extends JpaRepository<Ventas, Integer> {

}
