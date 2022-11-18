package com.example.projSem2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // busca de produtos por código, por descrição, por marca e por preço;

    @GetMapping("/buscarCodigo/{codigo}")
    public Optional<Produto> buscarProdutoCodigo(@PathVariable (value = "codigo") int codigo) {
        return produtoRepo.findById(codigo);
    }

    @GetMapping("/buscarDescricao/{descricao}")
    public List<Produto> buscarProdutoDescricao(@PathVariable("descricao") String descricao) {
        return produtoRepo.findByDescricao(descricao);
    }

    @GetMapping("/buscarMarca/{marca}")
    public List<Produto> buscarProdutoMarca(@PathVariable("marca") String marca) {
        return produtoRepo.findByMarca(marca);
    }

    @GetMapping("/buscarPreco/{preco}")
    public List<Produto> buscarProdutoPreco(@PathVariable("preco") int preco) {
        return produtoRepo.findByPreco(preco);
    }

    // - busca de produtos por parte inicial da descrição;

    @GetMapping("/buscarInicialDescricao/{descricao}")
    public List<Produto> buscarInicialDescricao(@PathVariable("descricao") String descricao) {
        return produtoRepo.findByInicialDescricao(descricao);
    }

    // - busca de produtos por parte inicial da marca;

    @GetMapping("/buscarInicialMarca/{marca}")
    public List<Produto> buscarInicialMarca(@PathVariable("marca") String marca) {
        return produtoRepo.findByInicialMarca(marca);
    }

    // - busca de produtos por preços maiores que algum informado;

    @GetMapping("/buscarPrecoMaiorQue/{preco}")
    public List<Produto> buscarPrecoMaiorQue(@PathVariable("preco") int preco) {
        return produtoRepo.findByPrecoMaiorQue(preco);
    }

    // - busca de produtos por preços menores que algum informado;

    @GetMapping("/buscarPrecoMenorQue/{preco}")
    public List<Produto> buscarPrecoMenorQue(@PathVariable("preco") int preco) {
        return produtoRepo.findByPrecoMenorQue(preco);
    }

    // - busca de produtos com parte da descrição e parte da marca informados

    @GetMapping("/buscarParteDescricaoMarca/{descricao}/{marca}")
    public List<Produto> buscarParteDescricaoMarca(@PathVariable("descricao") String descricao, @PathVariable("marca") String marca) {
        return produtoRepo.findByParteDescricaoMarca(descricao, marca);
    }

    // - busca de produtos com parte da descrição e preço menor que algum informado

    @GetMapping("/buscarParteDescricaoPrecoMenorQue/{descricao}/{preco}")
    public List<Produto> buscarParteDescricaoPrecoMenorQue(@PathVariable("descricao") String descricao, @PathVariable("preco") int preco) {
        return produtoRepo.findByParteDescricaoPrecoMenorQue(descricao, preco);
    }
}
