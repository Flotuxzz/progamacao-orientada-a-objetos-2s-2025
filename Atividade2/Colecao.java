package Atividade2;

public class Colecao implements ItemEmprestado {
    private Integer qntdItens;

    public Colecao(Integer qntdItens) {
        this.qntdItens = qntdItens;
    }


    public Integer getQntdItens() {
        return this.qntdItens;
    }

    public void setQntdItens(Integer qntdItens) {
        this.qntdItens = qntdItens;
    }

    public void descricao(){
        System.out.println("=== Colecao ===");
        System.out.println("Quantidade de Itens: " + this.getQntdItens());
    }
    
}
