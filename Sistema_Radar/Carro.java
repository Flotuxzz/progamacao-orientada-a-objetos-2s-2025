package Sistema_Radar;

public class Carro {
    public String placa;
    public String modelo;
    public Integer ano;
    public Integer velociodade;

    public void acelerar(){
        this.velociodade += 10;
        
    }
    public void frear(){
        if(this.velociodade > 0){
            this.velociodade -= 10;
        }
    }
}
