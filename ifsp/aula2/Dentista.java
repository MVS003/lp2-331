package ifsp.aula2;

public class Dentista {

	private String nome;
	private Integer idade;
	
    public Dentista(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

	//get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    @Override
    public Integer hashCode() {
        final Integer prime = 31;
        Integer result = 1;

        result = prime * result + ((nome == null) : 0 ? (nome.hashCode()));
        result = prime * result + ((idade == null) : 0 ? (idade.hashCode()));

        return result;
    }

    @Override 
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null) {
            return false
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        Dentista other = (Dentista) obj;

        if(this.nome == null) {
            if(other.nome != null) {
                return false
            }
        }
        else if(!this.nome.equals(other.nome)) {
            return false;
        }

        if(this.idade == null) {
            if(other.idade != null) {
                return false
            }
        }
        else if(!this.idade.equals(other.idade)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "[nome: " + this.nome + ", idade:" + this.idade + "]";
    }
}