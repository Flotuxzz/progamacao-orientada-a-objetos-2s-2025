package Atividade2;

public class Revista extends Material {
    private String autor;

    public Revista(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() { 
        return autor; 
    }
    public void setAutor(String autor) { 
        this.autor = autor; 
    }

    @Override
    public void descricao() {
        System.out.println("=== Revista ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + autor);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutor: " + autor;
    }
}