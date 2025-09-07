package br.com.biblioteca.model;

public class livros {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private int quantidade;

    public livros() {}

    public livros(String titulo, String autor, String genero, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
