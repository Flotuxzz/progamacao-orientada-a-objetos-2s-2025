package Atividade2;

public abstract class Material {
    private String titulo;
    private Integer anoPublicacao;

    public abstract void descricao();

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

    public Integer getAnoPublicacao() { 
        return anoPublicacao; 
    }
    public void setAnoPublicacao(Integer anoPublicacao) { 
        this.anoPublicacao = anoPublicacao; 
    }
}

