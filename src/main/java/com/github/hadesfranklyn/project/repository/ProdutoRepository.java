package com.github.hadesfranklyn.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.project.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
