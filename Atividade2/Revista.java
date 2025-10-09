package Atividade2;

public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, Integer anoPublicacao, Integer edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public Integer getEdicao() { 
        return edicao; 
    }
    public void setEdicao(Integer edicao) { 
        this.edicao = edicao; 
    }

    @Override
    public void descricao() {
        System.out.println("=== Revista ===");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Ano de Publicação: " + this.getAnoPublicacao());
        System.out.println("Autor: " + this.edicao);
    }
}