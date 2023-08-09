package br.com.fiap.main;

import javax.swing.JOptionPane;

public class TesteExcecao07 {

	public static void main(String[] args) {
		
		String aux;
		int num;
		try {
			aux = JOptionPane.showInputDialog("Digite um numero inteiro entre 1 e 20: ");
			
			num = Integer.parseInt(aux);
			if (num >= 1 && num <= 20) {
				JOptionPane.showMessageDialog(null, "Você digitou "+num);
			} else {
				throw new Exception("Valor fora da faixa");
			}
			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		JOptionPane.showMessageDialog(null, "Fim de programa");
		
	
	}

}