package ifsp.aula1;

public class Carro extends Veiculo {
    public String modelo;
    public String placa;

    //Construtores

    public Carro(String marca, Integer ano, String modelo, String placa) {
        super(marca, ano);
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carro(String modelo, String placa){
        super();
        this.modelo = modelo;
        this.placa = placa;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((modelo == null) : 0 ? (modelo.hashCode()));
        result = prime * result + ((placa == null) : 0 ? (placa.hashCode()));

        return result;
    }

    @Override 
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null) {
            return false;
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        Carro other = (Carro) obj;

        if(this.marca == null) {
            if(other.marca != null) {
                return false;
            }
        }
        else if(!this.marca.equals(other.marca)) {
            return false;
        }

        if(this.ano == null) {
            if(other.ano != null) {
                return false;
            }
        }
        else if(!this.ano.equals(other.ano)) {
            return false;
        }

        if(this.modelo == null) {
            if(other.modelo != null) {
                return false;
            }
        }
        else if(!this.modelo.equals(other.modelo)) {
            return false;
        }

        if(this.placa == null) {
            if(other.placa != null) {
                return false;
            }
        }
        else if(!this.placa.equals(other.placa)) {
            return false;
        }

        return true;
    }
}