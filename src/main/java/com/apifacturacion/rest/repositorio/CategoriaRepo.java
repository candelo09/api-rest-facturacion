package com.apifacturacion.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apifacturacion.rest.modelo.Categoria;

@Repository
public interface CategoriaRepo extends JpaRepository<Categoria, Integer> {

}
