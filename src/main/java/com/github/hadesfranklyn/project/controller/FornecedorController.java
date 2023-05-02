package com.github.hadesfranklyn.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.project.model.Fornecedor;
import com.github.hadesfranklyn.project.service.FornecedorService;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
	@Autowired
	private FornecedorService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Fornecedor> buscarFornecedorPorId(@PathVariable Long id) {
	    Fornecedor fornecedor = service.buscarUmID(id);
	    return ResponseEntity.ok(fornecedor);
	}
	
	@GetMapping
	public List<Fornecedor> listarFornecedores() {
		return service.listarFornecedores();
	}

	@PostMapping
	public Fornecedor salvarFornecedor(@RequestBody Fornecedor fornecedor) {
		return service.salvarFornecedor(fornecedor);
	}

	


	@DeleteMapping("/{id}")
	public void excluirFornecedor(@PathVariable Long id) {
		service.excluirFornecedor(id);
	}

}