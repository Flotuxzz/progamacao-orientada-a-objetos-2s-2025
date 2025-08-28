package Sistema_Radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro GTR = new Carro();
        GTR.ano = 2024;
        GTR.modelo = "35";
        GTR.placa = "KJ75K67";
        GTR.velociodade = 0;

        Radar radar = new Radar();
        radar.limiteVelo = 60;
        radar.localizacao = "Pistão Sul";

        radar.avaliarVelo(GTR);

        GTR.acelerar();//10
        GTR.acelerar();//20
        GTR.acelerar();//30
        GTR.acelerar();//40
        GTR.acelerar();//50
        GTR.acelerar();//60
        GTR.acelerar();//70

        radar.avaliarVelo(GTR);
    }
}
