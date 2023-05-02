package com.github.hadesfranklyn.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.project.model.Produto;
import com.github.hadesfranklyn.project.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService service;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Produto findById(@PathVariable(value = "id") Long id) {

		return service.findById(id);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Produto> findAll() {

		return service.findAll();
	}

	@PostMapping
	public Produto salvarProduto(@RequestBody Produto produto) {
		return service.salvarProduto(produto);
	}

	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable Long id) {
		service.excluirProduto(id);
	}
}