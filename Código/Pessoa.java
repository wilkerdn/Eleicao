package numero2;

public class Pessoa {
	private int tituloEleitor;
	private String nome;
	
	public int getTituloEleitor() {
		return tituloEleitor;
	}
	
	public void setTituloEleitor(int tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String retornaPessoa() {
		return "Titulo de eleitor: "+tituloEleitor+
				"\nNome: "+nome;
	}
}
