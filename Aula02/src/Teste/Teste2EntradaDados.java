package Teste;

import java.util.Scanner;

	public class Teste2EntradaDados {
		
		public static void main(String[] args) {
			String nome, sobrenome;
			int idade;
			double altura;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o nome: ");
			nome = sc.next();

			System.out.println("Digite o sobrenome: ");
			nome = sc.next();
			
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();

			System.out.println("Digite o altura: ");
			altura = sc.nextDouble();

			System.out.printf("%s %s tem %d anos", nome, idade, altura);
			
		}
	}
	
}
