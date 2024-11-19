package com.telemarketing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.telemarketing.entities.Endereco;
import com.telemarketing.services.EnderecoServices;

public class EnderecoController {

	@Autowired
	private EnderecoServices EnderecoServices;
	
	@PostMapping
	public Endereco createEndereco(Endereco endereco) {
		
		return EnderecoServices.saveEndereco(endereco);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> getAllEndereco(Long id) {
		
		Endereco endereco = EnderecoServices.getEnderecoById(id);
		
		if(endereco != null) {
			return ResponseEntity.ok(endereco);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/{id}")
	public Endereco getEndereco(@PathVariable Long id) {
		
		return EnderecoServices.getEnderecoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable Long id) {
		EnderecoServices.deleteEndereco(id);
	}
}
