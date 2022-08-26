package connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.Connection;
import static java.lang.System.exit;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {

    public Connection getConnection() {
        String url = "jdbc:mysql://143.106.241.3:3306/cl201239";
        String usuario = "cl201239";
        String senha = "cl*13072005";
        
        try {
            return (Connection) DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.toString());
            exit(1);
            return null;
        }
    }
}
