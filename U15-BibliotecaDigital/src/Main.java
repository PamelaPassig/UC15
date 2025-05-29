import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "Dom Casmurro", "Machado de Assis", "123456789", 3);
        Usuario usuario = new Usuario(1, "João Silva", "123.456.789-00", "11999999999");

        Emprestimo emprestimo = new Emprestimo(1, livro, usuario, new Date(), null, "Ativo");

        System.out.println("Empréstimo criado:");
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("Status: " + emprestimo.getStatus());
    }
}
