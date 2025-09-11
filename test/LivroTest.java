import org.junit.Test;
import static org.junit.Assert.*;
import br.com.biblioteca.model.Livro;

public class LivroTest {

    @Test
    public void testTemEstoqueDisponivel() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "Romance", 5);
        assertTrue(livro.temEstoqueDisponivel());

        Livro livroSemEstoque = new Livro("Memórias Póstumas", "Machado de Assis", "Romance", 0);
        assertFalse(livroSemEstoque.temEstoqueDisponivel());
    }
}