package br.com.fiap.main;

public class TesteExcecao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 2, 4, 10, 25, 33,45 };
		int div[] = {2, 2, 0, 5};
		for (int i = 0; i < num.length; i++) {
			try {
				System.out.println("Resultado: "+ (num[i])/ div[i]);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("Fim de programa");
			}
			
		}
	}

}
