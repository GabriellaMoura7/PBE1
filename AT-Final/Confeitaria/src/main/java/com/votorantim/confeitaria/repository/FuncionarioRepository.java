package com.votorantim.confeitaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.votorantim.confeitaria.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
