package Sistema_Radar;

public class Radar {
    public Integer limiteVelo;
    public String localizacao;

    public Radar(Integer limiteVelo, String localizacao){
        this.limiteVelo = limiteVelo;
        this.localizacao = localizacao;
    }

    public void avaliarVelo(Carro carro) {
        if (carro.getVelocidade() > this.limiteVelo) {
            // Emitir Notificação
            EmitirNotif(carro.getPlaca(), carro.getVelocidade());
        }
    }

    public void EmitirNotif(String placa, Integer velocidadeObservada) {
        System.out.println("Placa :" + placa);
        System.out.println("Velocidade observada :" + velocidadeObservada);
        System.out.println("Limite da via :" + this.limiteVelo);
    }
}
