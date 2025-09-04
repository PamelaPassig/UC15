import br.com.biblioteca.dao.LivroDAO;
import br.com.biblioteca.model.Livro;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LivroDAO dao = new LivroDAO();

        // Inserir livro
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "Romance", 5);
        dao.inserir(livro);
        System.out.println("Livro inserido com sucesso!");

        // Listar livros
        List<Livro> livros = dao.listar();
        for (Livro l : livros) {
            System.out.println(l.getId() + " - " + l.getTitulo() + " (" + l.getAutor() + ")");
        }
    }
}