import br.com.biblioteca.dao.LivrosDAO;
import br.com.biblioteca.model.Livro;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LivrosDAO dao = new LivrosDAO();

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "Romance", 5);
        dao.inserir(livro);
        System.out.println("Livro inserido com sucesso!");

        List<Livro> livros = dao.listar();
        for (Livro l : livros) {
            System.out.println(l.getId() + " - " + l.getTitulo() + " (" + l.getAutor() + ")");
        }

        if (!livros.isEmpty()) {
            System.out.println("Teste OK: livros foram inseridos e listados!");
        } else {
            System.out.println("Teste FALHOU: lista de livros vazia.");
        }
    }
}