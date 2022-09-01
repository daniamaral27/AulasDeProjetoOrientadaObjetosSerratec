package Teste;

import java.util.Scanner;

public class EntradaDeDados {
	//instancia(
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//variaveis
		int a, b;
		//metodos
		System.out.println("Entre com um valor");
		a = sc.nextInt();
		
		System.out.println("Entre com o segundo valor");
		b = sc.nextInt();
		
		System.out.println("\n O resultado da soma é: " + (a+b));
		
		sc.close();
	}

}
