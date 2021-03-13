package numero2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Candidato> candidatos = new ArrayList<>();
		Eleicao e = null;
		int op=1;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÕES\n"
					+ "1 - Cadastrar candidato\n"
					+ "2 - Cadastrar eleição\n"
					+ "3 - Votar\n"
					+ "4 - Imprimir vencedores\n"
					+ "5 - Imprimir quantidade de votos totais\n"
					+ "6 - Imprimir quantidade de votos para cada tipo de candidatura\n"
					+ "0 - Sair"));
			switch(op) {
			case 1:{
				Candidato c = new Candidato();
				c.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato")));
				c.setNome(JOptionPane.showInputDialog("Digite o nome"));
				c.setApelido(JOptionPane.showInputDialog("Digite o apelido"));
				c.setPartido(JOptionPane.showInputDialog("Digite o partido"));
				c.setTipoCandidatura(JOptionPane.showInputDialog("Digite o tipo de candidatura"));
				candidatos.add(c);
				break;
			}
			case 2:{
				e = new Eleicao();
				e.setData(JOptionPane.showInputDialog("Digite a data da eleição"));
				break;
			}
			case 3:{
				Pessoa p = new Pessoa();
				Voto v = new Voto();
				p.setNome(JOptionPane.showInputDialog("Digite o nome"));
				p.setTituloEleitor(Integer.parseInt(JOptionPane.showInputDialog("Digite o titulo de eleitor")));
				String imp = "";
				imp = "CANDIDATOS\n";
				for(int i=0;i<candidatos.size();i++) {
					imp += i+ " - "+ candidatos.get(i).retornaCandidato() +"\n\n";
				}
				int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição\n" + imp));
				v.setCandidato(candidatos.get(pos));
				v.setEleitor(p);
				e.inserirVoto(v);
				break;
			}
			case 4:{
				int op2 = 1;
				do {
				String tipo = JOptionPane.showInputDialog("Digite o tipo de cadidato");
				JOptionPane.showMessageDialog(null,e.retornaVencedor(tipo).getNome());
				op2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja obter outros vencedores?\n1 - SIM\n0 - NÃO"));
				}while(op2!=0);
				break;
			}
			case 5:{
				JOptionPane.showMessageDialog(null,"Quantidade total de votos: "+e.getVotos().size());
				break;
			}
			case 6:{
				String tipo2 = JOptionPane.showInputDialog("Digite o tipo de cadidato");
				JOptionPane.showMessageDialog(null,"Total de votos: " + e.retornaQuantVotosTipo(tipo2));
				break;
			}
			case 0:{
				JOptionPane.showMessageDialog(null,"Progama finalizado");
				break;
			}
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida!");
				break;
			}
	}while(op!=0);
	}
}
