package br.com.fiap.main;

public class TesteExcecao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {2, 4, 10, 0, 33};
		try {
			
			
			System.out.println(num[5]);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println("Fim de programa");
	}

}
