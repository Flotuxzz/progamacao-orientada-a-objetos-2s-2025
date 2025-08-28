package Sistema_Radar;

public class Radar {
    public Integer limiteVelo;
    public String localizacao;

    public void avaliarVelo(Carro carro){
        if(carro.velociodade > this.limiteVelo){
            //Emitir Notificação
            EmitirNotif(carro.placa,carro.velociodade);
        }
    }

    public void EmitirNotif(String placa, Integer velocidadeObservada){
        System.out.println("Placa :"+ placa);
        System.out.println("Velocidade observada"+velocidadeObservada);
        System.out.println("Limite da via"+this.limiteVelo);
    }
}
