package com.senaidev.saraiva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.saraiva.entities.livro;
import com.senaidev.saraiva.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@PostMapping
	public livro createlivro(livro livro) {
		
		return livroService.savelivro(livro);
	}
	
	@GetMapping
	public List<livro>getAlllivros() {
		
		return livroService.getAlllivros();
	}
	
	@GetMapping("/{id}")
	public livro getlivro(@PathVariable Long id) {
		
		return livroService.getlivroById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletelivro(@PathVariable Long id) {
		livroService.deletelivro(id);
	}
}
