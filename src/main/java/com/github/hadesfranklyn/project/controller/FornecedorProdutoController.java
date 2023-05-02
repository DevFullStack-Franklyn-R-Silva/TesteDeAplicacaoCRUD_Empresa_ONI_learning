package com.github.hadesfranklyn.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.project.model.FornecedorProduto;
import com.github.hadesfranklyn.project.service.FornecedorProdutoService;

@RestController
@RequestMapping("/fornecedores-produtos")
public class FornecedorProdutoController {

    @Autowired
    private FornecedorProdutoService fornecedorProdutoService;

    @PostMapping
    public FornecedorProduto salvar(@RequestBody FornecedorProduto fornecedorProduto) {
        return fornecedorProdutoService.salvar(fornecedorProduto);
    }

    @GetMapping
    public List<FornecedorProduto> buscarTodos() {
        return fornecedorProdutoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FornecedorProduto> buscarPorId(@PathVariable Long id) {
        Optional<FornecedorProduto> fornecedorProdutoOptional = fornecedorProdutoService.buscarPorId(id);
        if (fornecedorProdutoOptional.isPresent()) {
            return ResponseEntity.ok(fornecedorProdutoOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        fornecedorProdutoService.deletarPorId(id);
    }
}
