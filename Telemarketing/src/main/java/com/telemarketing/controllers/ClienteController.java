package com.telemarketing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.telemarketing.entities.Cliente;
import com.telemarketing.services.ClienteServices;

public class ClienteController {

	@Autowired
	private ClienteServices ClienteServices;
	
	@PostMapping
	public Cliente createCliente(Cliente cliente) {
		
		return ClienteServices.saveCliente(cliente);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> getAllCliente(Long id) {
		
		Cliente cliente = ClienteServices.getClienteById(id);
		
		if(cliente != null) {
			return ResponseEntity.ok(cliente);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		
		return ClienteServices.getClienteById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		ClienteServices.deleteCliente(id);
	}
}
