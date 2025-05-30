import java.sql.*;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca_digital?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "190320020319@@PmL";

    public static Connection conectar() throws SQLException {
        try {
            // Carrega explicitamente o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC do MySQL não encontrado.", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    
    }
}

