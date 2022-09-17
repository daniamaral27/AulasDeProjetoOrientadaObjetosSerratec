package exerciciosIndividuais;

import java.util.Scanner;

public class NumeroPareImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe um número: ");
		Integer numero = scan.nextInt();
		
		for (int i = 0; i < numero; i++) {
			if (i % 2  != 0) {
				System.out.println(i);
			}
		}
scan.close();
	}

}
