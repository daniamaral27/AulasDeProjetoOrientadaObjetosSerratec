package br.edu.senai.model;

import br.edu.senai.intefaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		System.out.println("Transacao ok");
	}

	@Override
	public void investimento() {
		System.out.println("Você aplicou em um investimento");
	}
	
	
}
