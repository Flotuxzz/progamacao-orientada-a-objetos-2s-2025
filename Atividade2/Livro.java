package Atividade2;

public class Livro extends Material {
    private String edicao;

    public Livro(String titulo, int anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public String getEdicao() { 
        return edicao; 
    }
    public void setEdicao(String edicao) { 
        this.edicao = edicao; 
    }

    @Override
    public void descricao() {
        System.out.println("=== Livro ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
    }

    @Override
    public String toString() {
        return super.toString() + "\nEdição: " + edicao;
    }
}