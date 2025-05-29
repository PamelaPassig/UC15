import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmprestimoDAO {
    public void inserir(Emprestimo emp) throws SQLException {
        String sql = "INSERT INTO emprestimo (livro_id, usuario_id, data_inicio, data_fim, status) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, emp.getLivro().getId());
            stmt.setInt(2, emp.getUsuario().getId());
            stmt.setDate(3, new Date(emp.getDataInicio().getTime()));
            stmt.setDate(4, emp.getDataFim() != null ? new Date(emp.getDataFim().getTime()) : null);
            stmt.setString(5, emp.getStatus());
            stmt.executeUpdate();
        }
    }
}
