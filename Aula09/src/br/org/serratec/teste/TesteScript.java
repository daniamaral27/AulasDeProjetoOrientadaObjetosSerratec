package br.org.serratec.teste;

public class TesteScript {

	public static void main(String[] args) {
		String texto = null;
	//toUpperCase = maiusculas
		try {
			texto = texto.toUpperCase();
			System.out.println(texto);
			
		} catch (NullPointerException e) {
			System.out.println("Valor nulo na string");
		}
		


	}

}
