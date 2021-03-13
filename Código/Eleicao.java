package numero2;

import java.util.ArrayList;

public class Eleicao {
	private ArrayList<Voto> votos;
	private String data;
	
	public Eleicao() {
		votos = new ArrayList<>();
		data = "";
	}
	
	public ArrayList<Voto> getVotos(){
		return votos;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void inserirVoto(Voto voto) {
		votos.add(voto);
	}
	
	public Candidato retornaVencedor(String tipoCandidatura) {
		int cont;
		int maior=0;
		Candidato vencedor = new Candidato();
		for(int i=0;i<votos.size();i++) {
			cont = 0;
			if(votos.get(i).getCandidato().getTipoCandidatura().equals(tipoCandidatura)){
				for(int j = 0;j<votos.size();j++){	
					if(votos.get(i).getCandidato().getNome().equals(votos.get(j).getCandidato().getNome())) {
					cont ++;
					}
				}
				if(cont>maior) {
					maior = cont;
					vencedor = votos.get(i).getCandidato();
				}
			}
		}
		return vencedor;
	}
	
	public int retornaQuantVotosTipo(String tipoCandidatura) {
		int votos = 0;
		for(Voto aux: this.votos) {
			if(aux.getCandidato().getTipoCandidatura().equals(tipoCandidatura)){
				votos ++;
			}
		}
		return votos;
	}
}
