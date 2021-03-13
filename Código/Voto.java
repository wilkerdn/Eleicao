package numero2;

public class Voto {
	private Pessoa eleitor;
	private Candidato candidato;
	
	public Voto() {
		eleitor = new Pessoa();
		candidato = new Candidato();
	}
	
	public Pessoa getEleitor() {
		return eleitor;
	}
	
	public void setEleitor(Pessoa eleitor) {
		this.eleitor = eleitor;
	}
	
	public Candidato getCandidato() {
		return candidato;
	}
	
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
}
