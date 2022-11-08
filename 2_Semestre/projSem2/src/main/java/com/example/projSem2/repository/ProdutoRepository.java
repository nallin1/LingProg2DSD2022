package com.example.projSem2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projSem2.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
