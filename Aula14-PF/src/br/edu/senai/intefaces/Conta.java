package br.edu.senai.intefaces;

public interface Conta {
	public void transacao();
//para interface ser funcional ela so pode ter uma unica assinatura.

//Metodo default  são metodos que contem implementacao dentro da interface

default void investimento() {
	System.out.println("Você aplicou em um investimento!");
	
	
}
}