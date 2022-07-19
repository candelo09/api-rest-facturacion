package com.apifacturacion.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apifacturacion.rest.modelo.Factura;

@Repository
public interface FacturaRepo extends JpaRepository<Factura, Integer> {

}
