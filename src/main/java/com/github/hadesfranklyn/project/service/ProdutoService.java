package com.github.hadesfranklyn.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.project.exceptions.ResourceNotFoundException;
import com.github.hadesfranklyn.project.model.Produto;
import com.github.hadesfranklyn.project.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;

	// get one
	public Produto findById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> 
				new ResourceNotFoundException("No records found for this ID!"));
	}

	// get all
	public List<Produto> findAll() {
		return repository.findAll();
	}

	public Produto salvarProduto(Produto produto) {
		return repository.save(produto);
	}

	public void excluirProduto(Long id) {
		
		var entity = repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID!"));
		repository.delete(entity);
		
	}

}