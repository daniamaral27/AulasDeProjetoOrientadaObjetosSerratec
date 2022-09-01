package br.org.serratec.diversos;

import java.time.LocalDate;

public class Exemplo02 {

	public static void main(String[] args) {
		// ALT+SHIFT+R - ALTERAR NOME DE VARIAVEIS E MÉTODOS
		// COLOCAR ARGUMENTOS> RUN > RUN CONFIGURATION > ARGUMENTS
		// CTRL+SHIFT+F - INDENTAÇÃO DO PROGRAMA
		int valor = 100;
		valor = 300;
		//CTRL + SHIFT + O - IMPORTAÇÃO DE PACOTES
		List Alunos;
		
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia: " + data);
		System.out.println(valor);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
