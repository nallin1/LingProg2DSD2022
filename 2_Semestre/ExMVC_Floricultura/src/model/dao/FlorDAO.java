package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Flor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class FlorDAO {

    Connection con;

    public void inserirFlor(Flor f) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "INSERT INTO floricultura (ESPECIE, PRECO, ALTURA) values (?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, f.getEspecie());
            stmt.setDouble(2, f.getPreco());
            stmt.setDouble(3, f.getAltura());

            stmt.execute();
        }
        con.close();
    }
    
    public void ExcluirFlor(String especieFlor) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM Floricultura WHERE Especie = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, especieFlor);
            stmt.execute();
        }
        con.close();
    }
}
