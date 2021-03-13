package numero2;

public class Candidato {
	private int numero;
	private String nome;
	private String apelido;
	private String partido;
	private String tipoCandidatura;
	
	public Candidato() {
		numero = 0;
		nome = "";
		apelido = "";
		partido = "";
		tipoCandidatura = "";
	}
	
	public Candidato(int numero, String apelido) {
		this.numero = numero;
		this.apelido = apelido;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getPartido() {
		return partido;
	}
	
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public String getTipoCandidatura() {
		return tipoCandidatura;
	}
	
	public void setTipoCandidatura(String tipoCandidatura) {
		this.tipoCandidatura = tipoCandidatura;
	}
	
	public String retornaCandidato() {
		return "Numero: "+numero+
				"\nNome: "+nome+
				"\nApelido: "+apelido+
				"\nPartido: "+partido+
				"\nTipo de candidatura: "+tipoCandidatura;	
	}
}
