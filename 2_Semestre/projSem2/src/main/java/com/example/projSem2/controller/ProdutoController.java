package com.example.projSem2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projSem2.model.Produto;
import com.example.projSem2.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/apiProduto")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepo;

    @GetMapping("/listarProdutos")
    public List<Produto> listarProdutos() {
        return produtoRepo.findAll();
    }

    @PostMapping("/cadastrarProdutos")
    public void cadastrarProdutos(@RequestBody Produto produto) {
        produtoRepo.save(produto);
    }
}
