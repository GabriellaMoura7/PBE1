package com.votorantim.confeitaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.votorantim.confeitaria.entities.Cliente;
import com.votorantim.confeitaria.services.ClienteService;

public class ClienteController {

	@Autowired
	private ClienteService ClienteService;
	
	@PostMapping
	public Cliente createCliente(Cliente cliente) {
		
		return ClienteService.saveCliente(cliente);
	}
	
	@GetMapping
	public List<Cliente>getAllCliente() {
		
		return ClienteService.getAllCliente();
	}
	
	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		
		return ClienteService.getClienteById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		ClienteService.deleteCliente(id);
	}
}
