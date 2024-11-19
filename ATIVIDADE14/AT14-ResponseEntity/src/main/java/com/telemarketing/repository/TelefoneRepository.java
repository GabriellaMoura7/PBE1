package com.telemarketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telemarketing.entities.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
