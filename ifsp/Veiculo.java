package ifsp;

public class Veiculo {
    public String marca;
    public Integer ano;

    //Construtores
    public Veiculo(String marca, Integer ano){
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo(String marca){
        this.marca = marca;
        this.ano = 0;
    }

    public Veiculo(){
    }

    //get/set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}