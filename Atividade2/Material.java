package Atividade2;

public abstract class Material {
    private String titulo;
    private int anoPublicacao;

    public Material(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() { 
        return titulo;
    }
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    public int getAnoPublicacao() { 
        return anoPublicacao; 
    }
    public void setAnoPublicacao(int anoPublicacao) { 
        this.anoPublicacao = anoPublicacao; 
    }

    public abstract void descricao();

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAno de Publicação: " + anoPublicacao;
    }
}
