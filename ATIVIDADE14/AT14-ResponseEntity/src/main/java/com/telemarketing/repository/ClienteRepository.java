package com.telemarketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telemarketing.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
