package Sistema_Radar;

public class Carro {
    private String placa;
    private String modelo;
    private Integer ano;
    private Integer velocidade;

    public Carro(String placa, String modelo, Integer ano, Integer velocidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public Integer getVelocidade(){
        
        return this.velocidade;
    }

    public String getPlaca(){
        
        return this.placa;
    }
    public String getModelo(){
        
        return this.modelo;
    }
    public Integer getAno(){
        
        return this.ano;
    }

    public void setVelocidade(Integer velocidade){
        if (velocidade != null && velocidade >= 0) {
            this.velocidade = velocidade;  
        }
    }
    public void setPlaca(String placa){

    }
    public void setModelo(String modelo){

    }
    public void setAno(Integer ano){

    }

    public void acelerar() {
        this.velocidade += 10;

    }

    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= 10;
        }
    }
}
