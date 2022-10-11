package connection;

// import com.mysql.jdbc.Connection;
import java.sql.Connection;
import static java.lang.System.exit;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() {
        String url = "jdbc:mysql://143.106.241.3:3306/cl201239";
        String user = "cl201239";
        String password = "cl*13072005";

        try {
            return (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro na conexao... \n" + e.toString());
            exit(1);
            return null;
        }
    }
}
