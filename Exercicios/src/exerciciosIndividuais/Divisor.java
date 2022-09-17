package exerciciosIndividuais;

import java.util.Scanner;

public class Divisor {
//ler um número inteiro N e calcular todos os seus divisores
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		Integer numero = scan.nextInt();

		for (int i = numero; i > 0; i--) {
			if(numero % i == 0) {
				System.out.println(i);
			}
			
		}
	}

}
