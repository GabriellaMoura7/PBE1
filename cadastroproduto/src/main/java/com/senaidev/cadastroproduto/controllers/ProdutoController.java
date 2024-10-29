package com.senaidev.cadastroproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastroproduto.ProdutoRepository;
import com.senaidev.cadastroproduto.entities.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public Produto createProduto(@RequestBody Produto produto) {
		
		return produtoRepository.saveProduto(produto);
	}
	
	@GetMapping
	public List<Produto> getAllProdutos() {
		
		return produtoService.getAllProdutos();
	}
	

}
