package com.votorantim.confeitaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.votorantim.confeitaria.entities.Funcionario;
import com.votorantim.confeitaria.services.FuncionarioService;

public class FuncionarioController {

	@Autowired
	private FuncionarioService FuncionarioService;
	
	@PostMapping
	public Funcionario createFuncionario(Funcionario funcionario) {
		
		return FuncionarioService.saveFuncionario(funcionario);
	}
	
	@GetMapping
	public List<Funcionario>getAllFuncionario() {
		
		return FuncionarioService.getAllFuncionario();
	}
	
	@GetMapping("/{id}")
	public Funcionario getFuncionario(@PathVariable Long id) {
		
		return FuncionarioService.getFuncionarioById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable Long id) {
		FuncionarioService.deleteFuncionario(id);
	}
}
