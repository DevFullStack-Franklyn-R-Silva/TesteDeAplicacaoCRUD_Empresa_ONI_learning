package com.github.hadesfranklyn.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.project.exceptions.ResourceNotFoundException;
import com.github.hadesfranklyn.project.model.Fornecedor;
import com.github.hadesfranklyn.project.repository.FornecedorRepository;

@Service
public class FornecedorService {
	@Autowired
	private FornecedorRepository repository;

	public List<Fornecedor> listarFornecedores() {
		return repository.findAll();
	}

	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return repository.save(fornecedor);
	}

	
	public Fornecedor buscarUmID(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> 
				new ResourceNotFoundException("No records found for this ID!"));
	}

	public void excluirFornecedor(Long id) {
		var entity = repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID!"));
		
		repository.delete(entity);
	}

}
