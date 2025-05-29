import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivrosDAO {
    public void inserir(Livro livro) throws SQLException {
        String sql = "INSERT INTO livro (titulo, autor, isbn, quantidade) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getIsbn());
            stmt.setInt(4, livro.getQuantidade());
            stmt.executeUpdate();
        }
    }
}
