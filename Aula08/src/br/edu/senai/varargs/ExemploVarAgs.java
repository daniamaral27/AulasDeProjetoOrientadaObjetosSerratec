package br.edu.senai.varargs;

import java.util.Iterator;

public class ExemploVarAgs {

	public static void main(String[] args) {
		String a= "qualquer coisa";
//		System.out.println("%s %d", 9, "tete");
		//varargs - aceita qualquer coisa.
		
		System.out.println(somarNumeros(10,20,30,40, 100,200));
	}
	
	public static int somarNumeros(int...numeros) {
		int soma=0;
		for(int valor : numeros) {
			soma+= valor;
		}
	return soma;
	}
	
	
	
}
