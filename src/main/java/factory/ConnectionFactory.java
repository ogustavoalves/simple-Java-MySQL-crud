package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fatec
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/vendas","root","your_password_here");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
