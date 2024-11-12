package com.senaidev.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.senaidev.mercado.entities.Produto;
import com.senaidev.mercado.services.ProdutoService;

public class ProdutoController {

	@Autowired
	private ProdutoService ProdutoService;
	
	@PostMapping
	public Produto createProduto(Produto produto) {
		
		return ProdutoService.saveProduto(produto);
	}
	
	@GetMapping
	public List<Produto>getAllProduto() {
		
		return ProdutoService.getAllProduto();
	}
	
	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		
		return ProdutoService.getProdutoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		ProdutoService.deleteProduto(id);
	}
}
