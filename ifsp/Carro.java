package ifsp;

public class Carro extends Veiculo {
    public String modelo;
    public String placa;

    //Construtores
    public Carro(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carro(String modelo){
        this.modelo = modelo;
        this.placa = "";
    }

    public Carro(){
    }

    //get/set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
