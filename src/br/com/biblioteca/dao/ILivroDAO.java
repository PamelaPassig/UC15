package br.com.biblioteca.dao;

import br.com.biblioteca.model.Livro;
import java.util.List;

public interface ILivroDAO {
    void inserir(Livro livro);
    List<Livro> listar();
}
