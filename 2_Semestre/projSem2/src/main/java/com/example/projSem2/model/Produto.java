package com.example.projSem2.model;

public class Produto {
    private int codigo;
    private String descricao;
    private String marca;
    private int preco;


    public Produto() {
    }

    public Produto(int codigo, String descricao, String marca, int preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

}
