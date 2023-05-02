package com.github.hadesfranklyn.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hadesfranklyn.project.exceptions.ResourceNotFoundException;
import com.github.hadesfranklyn.project.model.FornecedorProduto;
import com.github.hadesfranklyn.project.repository.FornecedorProdutoRepository;

@Service
public class FornecedorProdutoService {

    @Autowired
    private FornecedorProdutoRepository repository;

    public FornecedorProduto salvar(FornecedorProduto fornecedorProduto) {
        return repository.save(fornecedorProduto);
    }

    public List<FornecedorProduto> buscarTodos() {
        return repository.findAll();
    }

    public Optional<FornecedorProduto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarPorId(Long id) {
    	var entity = repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID!"));
		
    	repository.delete(entity);
    }
}
