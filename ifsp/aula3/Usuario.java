package ifsp.aula3;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<Post> lista;
	
    public Usuario(String nome, ArrayList<Post> lista) {
        this.nome = nome;
        this.lista = lista;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Post> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Post> lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "[nome: " + this.nome + ", Posts:" + this.lista + "]";
    }
}