package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.Conexao;

public class AnimalDAO {
    Connection con;

    public void inserirAnimal(Animal a) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "Insert into animalex (nome, nomeDono, idade, raca, peso) value (?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {

        }
    }
}
