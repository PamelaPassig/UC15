package br.com.biblioteca.dao;

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.util.Conexao;
import br.com.biblioteca.dao.ILivroDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivrosDAO implements ILivroDAO {

    public void inserir(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor, genero, quantidade) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getGenero());
            stmt.setInt(4, livro.getQuantidade());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir livro", e);
        }
    }

    @Override
    public List<Livro> listar() {
        List<Livro> lista = new ArrayList<>();
        String sql = "SELECT * FROM livro";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Livro livro = new Livro(
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getString("genero"),
                    rs.getInt("quantidade")
                );
                livro.setId(rs.getInt("id"));
                lista.add(livro);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar livros", e);
        }

        return lista;
    }
}
