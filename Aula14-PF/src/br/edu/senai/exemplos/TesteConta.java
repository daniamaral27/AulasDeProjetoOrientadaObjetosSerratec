package br.edu.senai.exemplos;

import br.edu.senai.intefaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta() {
			@Override
			public void transacao() {
				System.out.println("Transacao Efetuada!");
			}
		};
		conta.transacao();
	//Programacao Funcional - a partir do 8
		Conta conta2 = ()-> System.out.println("transacao efetuada conta2");
		conta2.transacao();
	}

	Conta conta = () -> System.out.println("Transacao Efetuada!");
	//Selecionar do new até antes do ponto-vírgula e
	//clicar no ctrl+1 para transformar o codigo em lambda
}

