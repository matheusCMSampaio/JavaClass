package br.com.fiap.main;

public class TesteExcecao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 2, 4, 10, 25, 33,45 };
		int div[] = {2, 2, 0, 5};
		for (int i = 0; i < num.length; i++) {
			System.out.println("Resultado: "+ (num[i])/ div[i]);
		}

		

		System.out.println("Fim de programa");
	}

}
