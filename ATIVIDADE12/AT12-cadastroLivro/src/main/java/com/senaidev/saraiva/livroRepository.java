package com.senaidev.saraiva;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.saraiva.entities.livro;

public interface livroRepository extends JpaRepository<livro, Long>{

}
