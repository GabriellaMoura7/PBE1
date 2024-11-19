package com.telemarketing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.telemarketing.entities.Telefone;
import com.telemarketing.services.TelefoneServices;

public class TelefoneController {

	@Autowired
	private TelefoneServices TelefoneServices;
	
	@PostMapping
	public Telefone createTelefone(Telefone telefone) {
		
		return TelefoneServices.saveTelefone(telefone);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Telefone> getAllTelefone(Long id) {
		
		Telefone telefone = TelefoneServices.getTelefoneById(id);
		
		if(telefone != null) {
			return ResponseEntity.ok(telefone);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/{id}")
	public Telefone getTelefone(@PathVariable Long id) {
		
		return TelefoneServices.getTelefoneById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTelefone(@PathVariable Long id) {
		TelefoneServices.deleteTelefone(id);
	}
}
