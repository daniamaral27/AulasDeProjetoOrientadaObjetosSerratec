package br.edu.senai.teste;

import br.edu.senai.arquivos.empregado;

public class testeempregados {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("123", "Ronaldo");
		empregado empregado1 = new Empregado("321", "Roberta");

		System.out.println(empregado1);
		System.out.println(empregado2);
		if(empregado1.equals(empregado2)) {
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferente");
		}
		
	}

}
