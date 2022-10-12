package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.Conexao;
import model.Servico;

public class ServicoDAO {
    Connection con;

    public void inserirServico(Servico s) throws SQLException {
        con = new Conexao().getConnection();
        try (PreparedStatement stmt = con.prepareStatement(
                "insert into servicoex (nome, descricao, duracao, profissional) values (?, ?, ?, ?)")) {
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getNome());
            stmt.setFloat(3, s.getDuracao());
            stmt.setString(4, s.getProfissional());

            stmt.execute();
        }

        con.close();
    }

    public void excluirServico(String nome) throws SQLException {
        con = new Conexao().getConnection();
        try (PreparedStatement stmt = con.prepareStatement(
                "delete from servicoex where nome = ?")) {
            stmt.setString(1, nome);
            stmt.execute();
        }
        con.close();
    }

    public ArrayList<Servico> buscarServicos() throws SQLException {
        ArrayList<Servico> servicos = new ArrayList<Servico>();

        ResultSet rsServicos;
        con = new Conexao().getConnection();
        PreparedStatement stmt = con.prepareStatement("Select * from servicoex");

        rsServicos = stmt.executeQuery();

        while (rsServicos.next()) {
            String nome = rsServicos.getString("nome");
            String descricao = rsServicos.getString("descricao");
            float duracao = rsServicos.getFloat("duracao");
            String profissional = rsServicos.getString("profissional");

            Servico s = new Servico(nome, descricao, duracao, profissional);
            servicos.add(s);
        }
        stmt.close();
        con.close();
        return servicos;
    }

    public ArrayList<Servico> buscarServicosDesc(String descServico) throws SQLException {
        ArrayList<Servico> servicosDesc = new ArrayList<>();
        ResultSet rsServicosDesc;
        con = new Conexao().getConnection();
        PreparedStatement stmt = con.prepareStatement("Select * from servicoex where descricao like ?");
        stmt.setString(1, descServico + "%");
        rsServicosDesc = stmt.executeQuery();

        while (rsServicosDesc.next()) {
            String nome = rsServicosDesc.getString("nome");
            String descricao = rsServicosDesc.getString("descricao");
            float duracao = rsServicosDesc.getFloat("duracao");
            String profissional = rsServicosDesc.getString("profissional");

            Servico s = new Servico(nome, descricao, duracao, profissional);
            servicosDesc.add(s);
        }

        return servicosDesc;
    }

    public ArrayList<Servico> buscarServicosNome(String nomeServico) throws SQLException {
        ArrayList<Servico> servicosNome = new ArrayList<>();
        ResultSet rsServicosNome;
        con = new Conexao().getConnection();
        PreparedStatement stmt = con.prepareStatement("Select * from servicoex where nome like ?");
        stmt.setString(1, nomeServico + "%");
        rsServicosNome = stmt.executeQuery();

        while (rsServicosNome.next()) {
            String nome = rsServicosNome.getString("nome");
            String descricao = rsServicosNome.getString("descricao");
            float duracao = rsServicosNome.getFloat("duracao");
            String profissional = rsServicosNome.getString("profissional");

            Servico s = new Servico(nome, descricao, duracao, profissional);
            servicosNome.add(s);
        }

        return servicosNome;
    }
}
