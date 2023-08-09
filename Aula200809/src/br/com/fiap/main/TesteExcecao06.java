package br.com.fiap.main;

import javax.swing.JOptionPane;

public class TesteExcecao06 {

	public static void main(String[] args) {
		
		String aux;
		int num;
		aux = JOptionPane.showInputDialog("Digite um numero inteiro entre 1 e 20: ");
		
		num = Integer.parseInt(aux);
		JOptionPane.showMessageDialog(null, "Você digitou "+num);
	}

}
