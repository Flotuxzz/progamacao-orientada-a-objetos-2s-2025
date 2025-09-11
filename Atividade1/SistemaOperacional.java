package Atividade1;
public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("SSD Indisponivel pelo computador");
            
        }else

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Memoria RAM Indisponivel pelo computador");
            
        }else 
            
        if(p.getMemoriaRAMAlocada() <= computador.getMemoriaRAM() && p.getSSDOcupado() <= computador.getSSD()){

        System.out.println("Programa executado com sucesso!");

        }
        
    float tempoExecucao = (float) p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleos());
    System.out.printf("Tempo de execucao: %.2f segundos%n", tempoExecucao);
    return true;   
        
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}