package br.org.serratec.teste;

import java.util.Scanner;

public class ExemploScanner {

	public Integer lerDados(){
	Integer numero;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe um numero");
	numero = sc.nextInt();
	sc.close();
	return numero;
}

	//public static void main(String[] args)

	}

