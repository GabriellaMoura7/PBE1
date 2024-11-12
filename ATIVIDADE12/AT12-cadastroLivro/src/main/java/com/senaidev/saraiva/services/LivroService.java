package com.senaidev.saraiva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.saraiva.livroRepository;
import com.senaidev.saraiva.entities.livro;

@Service
public class LivroService {

	@Autowired
	private livroRepository livrorepository;
	
	public livro savelivro(livro livro) {
		
		return livrorepository.save(livro);
	}
	
	public List<livro> getAlllivros() {
		
		return livrorepository.findAll();
	}
	
	public livro getlivroById(Long id) {
		
		return livrorepository.findById(id).orElse(null);
	}
	
	public void deletelivro(Long id) {
		livrorepository.deleteById(id);
	}
}
