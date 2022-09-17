package br.org.serratec.teste;

import br.org.serratec.calculo.CalculoMedia;

public class TesteDivisao {

	public static void main(String[] args) {
		try {
			System.out.println(CalculoMedia.calcular(10, 0));
			
		} catch (ArithmeticException e) {
			System.out.println("Erro!! Verifique seu código");
		} finally {
			System.out.println("Sempre é executado independente se cair ou não no catch");
		}
	}

}
