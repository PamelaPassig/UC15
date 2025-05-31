import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class LivrosDAO {
    public void inserirLivro(livros livro) {
        String sql = "INSERT INTO livro (titulo, autor, genero, quantidade) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getGenero());
            stmt.setInt(4, livro.getQuantidade());

            stmt.executeUpdate();
            System.out.println("Livro cadastrado com sucesso.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<livros> listarLivros() throws SQLException {
        List<livros> lista = new ArrayList<>();
        String sql = "SELECT titulo, autor, genero, quantidade FROM livro";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String genero = rs.getString("genero");
                int quantidade = rs.getInt("quantidade");
                boolean disponivel = quantidade > 0;

                lista.add(new livros(titulo, autor, genero, quantidade));
            }
        }
        return lista;
    }
}
