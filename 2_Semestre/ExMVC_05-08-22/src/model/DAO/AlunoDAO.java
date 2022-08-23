package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class AlunoDAO {
    Connection con;
    
    public void inserirAluno(Aluno al) throws SQLException
    { 
            con = new Conexao().getConnection();
            String sql = "Insert into AlunoJava (RA,NOME) values (?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, al.getRa());
            stmt.setString(2, al.getNome());
            stmt.execute();
        }
            con.close();    
    }
    
    public void excluir(int ra) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM AlunoJava WHERE RA = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, ra);
            stmt.execute();
        }
        con.close();
    }
}
