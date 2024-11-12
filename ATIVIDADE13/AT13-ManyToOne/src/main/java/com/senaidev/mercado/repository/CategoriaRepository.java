package com.senaidev.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.mercado.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
