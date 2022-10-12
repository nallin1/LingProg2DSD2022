package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.Conexao;
import model.*;

public class AnimalDAO {
    Connection con;
    //

    // inserir animal
    public void inserirAnimal(Animal a) throws SQLException {
        con = new Conexao().getConnection();
        try (PreparedStatement stmt = 
            con.prepareStatement("Insert into animalex (nome, nomeDono, idade, raca, peso) value (?,?,?)")) 
        {
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getNomeDono());
            stmt.setInt(3, a.getIdade());
            stmt.setString(3, a.getRaca());
            stmt.setDouble(4, a.getPeso());

            stmt.execute();
        }
        con.close();
    }

    // excluir
    public void excluirAnimal(String nomeAnimal) throws SQLException {
        //estabelece con
        con = new Conexao().getConnection();

        // inicia a query
        try (PreparedStatement stmt = 
            con.prepareStatement("Delete from animalex where nome = ?")) 
        {
            stmt.setString(1, nomeAnimal);
            
            stmt.execute();
        }
        con.close();
    }

    public ArrayList<Animal> buscarAnimais() throws SQLException {
        ArrayList<Animal> animais = new ArrayList<Animal>();

        ResultSet rsAnimais;
        con = new Conexao().getConnection();
        PreparedStatement stmt = con.prepareStatement("Select * from animalex");

        rsAnimais = stmt.executeQuery();

        while (rsAnimais.next()) {
            String nome = rsAnimais.getString("nome");
            String nomeDono = rsAnimais.getString("nomeDono");
            int idade = rsAnimais.getInt("idade");
            String raca = rsAnimais.getString("raca");
            float peso = rsAnimais.getFloat("peso");

            Animal a = new Animal(nome, nomeDono, idade, raca, peso);
            animais.add(a);
        }
        stmt.close();
        con.close();
        return animais;
    }

    public ArrayList<Animal> buscarAnimaisNome(String animalNome) throws SQLException {
        ArrayList<Animal> animaisNome = new ArrayList<>();
        ResultSet rsAnimaisNome;

        con = new Conexao().getConnection();
        PreparedStatement stmt = con.prepareStatement("select * from animalex where nome like ?");
        stmt.setString(1, animalNome + "%");
        rsAnimaisNome = stmt.executeQuery();
        
        while (rsAnimaisNome.next()) {
            String nome = rsAnimaisNome.getString("nome");
            String nomeDono = rsAnimaisNome.getString("nomeDono");
            int idade = rsAnimaisNome.getInt("idade");
            String raca = rsAnimaisNome.getString("raca");
            float peso = rsAnimaisNome.getFloat("peso");

            Animal a = new Animal(nome, nomeDono, idade, raca, peso);
            animaisNome.add(a);
        }
        stmt.close();
        con.close();
        return animaisNome;
    }
}
