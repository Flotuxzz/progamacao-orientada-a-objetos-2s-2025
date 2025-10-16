package Atividade2;

public class Emprestimo {
    private TomadorEmprestimo tomadorEmprestimo;
    private ItemEmprestado itemEmprestado;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, ItemEmprestado itemEmprestado, String dataEmprestimo, String dataDevolucao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.itemEmprestado = itemEmprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public TomadorEmprestimo getTomadorEmprestimo() {
        return this.tomadorEmprestimo;
    }

    public void setTomadorEmprestimo(TomadorEmprestimo tomadorEmprestimo) {
        this.tomadorEmprestimo = tomadorEmprestimo;
    }

    public ItemEmprestado getItemEmptrestado() {
        return this.itemEmprestado;
    }

    public void setItemEmprestado(ItemEmprestado itemEmprestado) {
        this.itemEmprestado = itemEmprestado;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes(){
        System.out.println("Data do empréstimo: " + this.dataEmprestimo);
        System.out.println("Data da devolução: " + this.dataDevolucao);
        System.out.println("Pessoa vinculada");
        this.tomadorEmprestimo.exibirInfo();
        System.out.println("Material vinculada");
        this.itemEmprestado.descricao();
    }
}