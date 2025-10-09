package Atividade2;

public class Usuario extends Pessoa {
    private int matricula;

    public Usuario(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public int getMatricula() { 
        return matricula; 
    }
    public void setMatricula(int matricula) { 
        this.matricula = matricula; 
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== Dados do Usuário ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + matricula);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + matricula;
    }
}

