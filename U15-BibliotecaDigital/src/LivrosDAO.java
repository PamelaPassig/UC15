import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
public class LivrosDAO {
    
    public static List<Livro> listarLivros() throws SQLException {
        List<Livro> lista = new ArrayList<>();
        String sql = "SELECT titulo, autor, genero, quantidade FROM livros";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String genero = rs.getString("genero");
                int quantidade = rs.getInt("quantidade");
                boolean disponivel = quantidade > 0;

                lista.add(new Livro(titulo, autor, genero, disponivel));
            }
        }
        return lista;
    }
}
