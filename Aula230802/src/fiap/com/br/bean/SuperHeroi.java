package fiap.com.br.bean;

import javax.swing.JOptionPane;

public class SuperHeroi {
	private String nome;
	private String idSecreto;
	private String[] poderes;
	private String[] fraquezas;

	public SuperHeroi() {
		// TODO Auto-generated constructor stub
	}

	public SuperHeroi(String nome, String idSecreto, String[] poderes, String[] fraquezas) {
		this.nome = nome;
		this.idSecreto = idSecreto;
		this.poderes = poderes;
		this.fraquezas = fraquezas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdSecreto() {
		return idSecreto;
	}

	public void setIdSecreto(String idSecreto) {
		this.idSecreto = idSecreto;
	}

	public String[] getPoderes() {
		return poderes;
	}

	public void setPoderes(String[] poderes) {
		this.poderes = poderes;
	}

	public String[] getFraquezas() {
		return fraquezas;
	}

	public void setFraquezas(String[] fraquezas) {
		this.fraquezas = fraquezas;
	}
	
	public void listaHeroi() {
		String exibe = "Nome: "+ this.nome+ "\nIdentidade secreta: "+ this.idSecreto;
		int cont = 1;
		for(String i: poderes) {
			exibe += "Poder "+ (cont+1)+":"+ i;
		}
		cont = 1;
		for(String i: fraquezas) {
			exibe += "Fraqueza "+ (cont+1)+":"+ i;
		}
		
		JOptionPane.showMessageDialog(null, exibe);
	}

}
