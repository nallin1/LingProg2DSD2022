/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Flor;
import model.dao.FlorDAO;

/**
 *
 * @author aluno
 */
public class FlorController {
    public void cadastrarFlorController(String especie, double preco, double altura) throws SQLException {
        Flor f = new Flor(preco, especie, altura);
        
        FlorDAO fDAO = new FlorDAO();
        fDAO.inserirFlor(f);
    }
    
    public void excluirFlorController(String especie) throws SQLException {
        FlorDAO fDAO = new FlorDAO();
        fDAO.ExcluirFlor(especie);
    }
}
