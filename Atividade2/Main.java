package Atividade2;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Lucas Pereira", "lucas@email.com", 12345);
        Livro livro = new Livro("Programação Orientada a Objetos em Java", 2024, "3ª edição");

        Emprestimo emprestimo = new Emprestimo(usuario, livro, "08/10/2025", "15/10/2025");
        emprestimo.exibirDetalhes();

        System.out.println("\n-----------------------------\n");

        Funcionario funcionario = new Funcionario("Mariana Souza", "mariana@biblioteca.com", "Atendente");
        Revista revista = new Revista("Ciência Hoje", 2023, "Dr. Silva");

        Emprestimo emprestimo2 = new Emprestimo(funcionario, revista, "10/10/2025", "17/10/2025");
        emprestimo2.exibirDetalhes();
    }
}
