package ifsp.aula3;

import java.time.LocalDateTime;

public class Post implements Comparable<Post>{
	private LocalDateTime dataHorario;
	private String textoPost;
	
    public Post(LocalDateTime dataHorario, String textoPost) {
        this.dataHorario = dataHorario;
        this.textoPost = textoPost;
    }
    public Post() {
    }

	//get/set
    public LocalDateTime getDataHorario() {
        return dataHorario;
    }
    public void setDataHorario(LocalDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }
    
    public String getTextoPost() {
        return textoPost;
    }
    public void setTextoPost(String textoPost) {
        this.textoPost = textoPost;
    }

    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHorario == null) ? 0 : dataHorario.hashCode());
		result = prime * result + ((textoPost == null) ? 0 : textoPost.hashCode());
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
		Post other = (Post) obj;
		if (dataHorario == null) {
			if (other.dataHorario != null)
				return false;
		} else if (!dataHorario.equals(other.dataHorario))
			return false;
		if (textoPost == null) {
			if (other.textoPost != null)
				return false;
		} else if (!textoPost.equals(other.textoPost))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "[Texto: " + this.textoPost + ", data e horário:" + this.dataHorario + "]";
    }
    
    @Override
    public int compareTo(Post other) {
    	return this.dataHorario.compareTo(other.dataHorario);
    }
    
}