/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author aluno
 */
public class ProdutoController {

    ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public void cadastraProduto(int codigo, String descricao, double preco) {
        Produto p = new Produto(codigo, descricao, preco);
        listaProduto.add(p);
    }

    public ArrayList buscarTodos() {
        return listaProduto;
    }

    public void excluir(int Codigo) {
        for (Produto p : listaProduto) {
            if (p.getCodigo() == Codigo) {
                listaProduto.remove(p);
            }
        }
    }

}
