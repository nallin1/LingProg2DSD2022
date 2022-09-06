package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql = "insert into floricultura (especie, preco, altura) values (?,?,?)";
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
        String sql = "DELETE FROM floricultura WHERE Especie = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, especieFlor);
            stmt.execute();
        }
        con.close();
    }

    public ArrayList<Flor> buscarFlores() throws SQLException {
        ArrayList<Flor> listaFlores = new ArrayList<Flor>();
        ResultSet rs;
        con = new Conexao().getConnection();

        String sql = "SELECT * FROM floricultura";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();

        while (rs.next()) {
            String especie = rs.getString("especie");
            double preco = rs.getDouble("preco");
            double altura = rs.getDouble("altura");

            Flor f = new Flor(especie, preco, altura);
            listaFlores.add(f);
        }

        stmt.close();
        con.close();
        return listaFlores;
    }
    
    public ArrayList<Flor> buscarFlorEspecie(String nomeFlor) throws SQLException {
        ResultSet rs;
        ArrayList<Flor> florBuscaEspecie = new ArrayList<Flor>();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM floricultura WHERE especie LIKE ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nomeFlor + "%");
        rs = stmt.executeQuery();
        while (rs.next()) {
            String especie = rs.getString("especie");
            double preco = rs.getDouble("preco");
            double altura = rs.getDouble("altura");
            Flor floresEncontradas = new Flor(especie, preco, altura);
            florBuscaEspecie.add(floresEncontradas);
        }
        stmt.close();
        con.close();
        return florBuscaEspecie;
        
    }
}
