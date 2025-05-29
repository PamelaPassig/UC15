import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca_digital";
    private static final String USER = "root";
    private static final String PASSWORD = "190320020319@@PmL";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

