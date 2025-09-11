package Atividade1;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 512, 4, 2.5f);
        SistemaOperacional so = new SistemaOperacional(pc);

        Programa p1 = new Programa(8, 100, 2, 1000);
        so.executarPrograma(p1);

        Programa p2 = new Programa(8, 600, 2, 2000);
        so.executarPrograma(p2);

        Programa p3 = new Programa(32, 200, 4, 3000);
        so.executarPrograma(p3);
    }
}

