package br.edu.senai.matriz;

public class exemplo2matriz {

	public static void main(String[] args) {
		String pessoas[][] = 
							{{"Marcos", "m@gmail.com"},
							{"Maria", "ma@gmail.com"},
							{"Marcia", "mr@gmail.com"},
							{"Mario", "mo@gmail.com"},
							};
	for (int linha = 0; linha < pessoas.length; linha++) {
			System.out.println("*************************");
		for (int coluna = 0; coluna < pessoas[linha].length; coluna++) {
			System.out.println(pessoas[linha][coluna]);
		}
	}	
	
	
	}
	}

