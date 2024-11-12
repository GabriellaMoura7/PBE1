package com.senaidev.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.mercado.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
